package com.nd.sdp.gradle

import groovy.text.SimpleTemplateEngine
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.incremental.IncrementalTaskInputs

public class GenerateEmotionClassTask extends DefaultTask {

    @TaskAction
    def generateEmotionClass() {
        def variants = null
        if (project.android.hasProperty('applicationVariants')) {
            variants = project.android.applicationVariants
        } else if (project.android.hasProperty('libraryVariants')) {
            variants = project.android.libraryVariants
        } else {
            throw new IllegalStateException('Android project must have applicationVariants or libraryVariants!')
        }
        // 生成代码文件
        def aptOutput = project.file(project.android.sourceSets.main.java.srcDirs[0])
        String assets = project.android.sourceSets.main.assets
        def assetsPath = project.projectDir.absolutePath + "/" + assets.substring(1, assets.length() - 1)
        def file = project.file(assetsPath);
        def list = file.list()
        if (list.size() > 0) {
            list.each {
                dir ->
                    if (dir.equals("emotion")) {
                        def emotionDir = project.file(assetsPath + "/emotion/")
                        def groups = emotionDir.list()
                        String groupSection = "";
                        groups.each {
                            group ->
                                def groupDir = new File(emotionDir, group)
                                def xmlFile = new File(groupDir, "smiley.xml")
                                def smileyGroup = parseXml(xmlFile.absolutePath)
                                def engine = new SimpleTemplateEngine();
                                // 表情字段填充
                                String emotionSection = "";
                                smileyGroup.group.smiley.each {
                                    s ->
                                        def textEmotionSection = EmotionXmlPlugin.class.getResource("/EmotionSection.template").text;
                                        def emotionBinding = [
                                                emotionid: s.@id,
                                                filename : s.@filename,
                                                thumbnail: s.@thumbnail,
                                                dirname  : group,
                                                en       : s.tip.en.text(),
                                                ch       : s.tip.cn.text(),
                                                tw       : s.tip.tw.text()
                                        ]
                                        def emotionResult = engine.createTemplate(textEmotionSection).make(emotionBinding).toString()
                                        emotionSection += emotionResult;
                                }

                                def textGroupSection = this.getClass().getResource("/GroupSection.template").text;
                                def groupBinding = [
                                        groupid       : smileyGroup.group.@id[0],
                                        normalimg     : smileyGroup.group.@normal_img[0],
                                        selimg        : smileyGroup.group.@selected_img[0],
                                        name          : smileyGroup.group.@name[0],
                                        classname     : getGroupClassName(smileyGroup.group.@type[0]),
                                        order         : smileyGroup.group.@order[0],
                                        ext           : smileyGroup.group.@ext[0],
                                        type          : getType(smileyGroup.group.@type[0]),
                                        dirname       : group,
                                        emotionsection: emotionSection
                                ]
                                def groupResult = engine.createTemplate(textGroupSection).make(groupBinding).toString()
                                groupSection += groupResult;
                                groupSection += "\n";
                        }

                        def engine = new SimpleTemplateEngine();
                        def text = this.getClass().getResource("/AssetsGroups.java.template").text;
                        def binding = [
                                groupsection: groupSection
                        ]
                        Writable template = engine.createTemplate(text).make(binding)
                        def filePath = aptOutput.absolutePath + "/com/nd/android/sdp/im/common/emotion/library/getter/AssetsGroups.java"
                        new File(aptOutput.absolutePath + "/com/nd/android/sdp/im/common/emotion/library/getter/").mkdirs()
                        File classFile = new File(filePath)
                        classFile.createNewFile()
                        def newWriter = classFile.newWriter()
                        template.writeTo(newWriter)
                    }
            }
        }

    }

    def parseXml(path) {
        def smileys = (new XmlParser()).parse(path)
        return smileys
    }

    def getGroupClassName(String type) {
        if (type.equals("TEXT_PIC")) {
            return "TextPicGroup"
        } else if (type.equals("EMOJI")) {
            return "EmojiGroup"
        } else {
            return "PicGroup"
        }
    }

    def getType(String type) {
        if (type.equals("TEXT_PIC")) {
            return "EmotionTypeUtils.TEXT_PIC"
        } else if (type.equals("EMOJI")) {
            return "EmotionTypeUtils.EMOJI"
        } else {
            return "EmotionTypeUtils.PIC"
        }
    }

}