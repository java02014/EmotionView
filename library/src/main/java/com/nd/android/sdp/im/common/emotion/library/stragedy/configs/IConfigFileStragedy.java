package com.nd.android.sdp.im.common.emotion.library.stragedy.configs;

import java.io.IOException;
import java.io.InputStream;

/**
 * 配置XML策略
 *
 * @author Young
 */
public interface IConfigFileStragedy {

    /**
     * 获取配置文件流
     *
     * @return the config
     */
    InputStream getConfig() throws IOException;

}
