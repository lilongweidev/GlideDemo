package com.llw.glidedemo;

import android.app.Application;

/**
 * 自定义应用
 * @author llw
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GlideUtil.init(this);
    }
}
