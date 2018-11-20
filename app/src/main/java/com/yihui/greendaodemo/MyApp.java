package com.yihui.greendaodemo;

import android.app.Application;

/**
 * 功能详细描述
 *
 * @author: zhouxing
 * @version: [1.0, 2018/11/20]
 * @see: [相关类/方法]
 * @describe: [产品/模块版本]
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化数据库
        DbCore.init(this);
    }
}
