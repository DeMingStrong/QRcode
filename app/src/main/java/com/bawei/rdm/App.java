package com.bawei.rdm;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * Time:2019/8/2 0002
 * <p>
 * Author:任德明
 * <p>
 * Description:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }
}
