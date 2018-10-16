package com.mmdteam.jpushlib;

import android.app.Application;
import android.util.Log;

import cn.jpush.android.api.JPushInterface;

public class App extends Application {


    private static final String TAG = "JIGUANG-Example";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: [Example Application]");
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);//初始化JPush
    }
}
