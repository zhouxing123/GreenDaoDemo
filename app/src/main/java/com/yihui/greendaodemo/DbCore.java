package com.yihui.greendaodemo;

import android.content.Context;

import com.inst.greendao3_demo.dao.DaoMaster;
import com.inst.greendao3_demo.dao.DaoSession;

import org.greenrobot.greendao.query.QueryBuilder;

/**
 * 功能详细描述
 *
 * @author: zhouxing
 * @version: [1.0, 2018/11/20]
 * @see: [相关类/方法]
 * @describe: [产品/模块版本]
 */
public class DbCore {
    private static final String DEFAULT_DB_NAME = "green-dao.db";
    private static DaoMaster daoMaster;
    private static DaoSession daoSession;

    private static Context mContext;
    private static String DB_NAME;

    public static void init(Context context) {
        init(context, DEFAULT_DB_NAME);
    }

    public static void init(Context context, String dbName) {
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        mContext = context.getApplicationContext();
        DB_NAME = dbName;
    }

    public static DaoMaster getDaoMaster() {
        if (daoMaster == null) {
            //此处不可用 DaoMaster.DevOpenHelper, 那是开发辅助类，我们要自定义一个，方便升级
            MyOpenHelper helper = new MyOpenHelper(mContext, DB_NAME);
            daoMaster = new DaoMaster(helper.getEncryptedReadableDb("password"));
        }
        return daoMaster;
    }

    public static DaoSession getDaoSession() {
        if (daoSession == null) {
            if (daoMaster == null) {
                daoMaster = getDaoMaster();
            }
            daoSession = daoMaster.newSession();
        }
        return daoSession;
    }

    public static void enableQueryBuilderLog(){
        QueryBuilder.LOG_SQL = true;
        QueryBuilder.LOG_VALUES = true;
    }

}
