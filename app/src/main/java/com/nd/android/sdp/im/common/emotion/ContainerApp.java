package com.nd.android.sdp.im.common.emotion;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by Administrator on 2015/8/25.
 */
public class ContainerApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(
                                Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(
                                Stetho.defaultInspectorModulesProvider(this))
                        .build());
    }
}
