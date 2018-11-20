package com.yihui.greendaodemo;

import android.content.Context;
import android.util.Log;

import com.inst.greendao3_demo.dao.DaoMaster;
import com.inst.greendao3_demo.dao.TestEntityDao;

import org.greenrobot.greendao.database.Database;


import android.content.Context;

/**
 * 功能详细描述
 *
 * @author: zhouxing
 * @version: [1.0, 2018/11/20]
 * @see: [相关类/方法]
 * @describe: [产品/模块版本]
 */
public class MyOpenHelper extends DaoMaster.OpenHelper {
    public MyOpenHelper(Context context, String name) {
        super(context, name);
    }


    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        Log.e("-----","db version update from " + oldVersion + " to " + newVersion);

        switch (oldVersion) {
            case 1:

                //不能先删除表，否则数据都木了
//                StudentDao.dropTable(db, true);

                TestEntityDao.createTable(db, true);

                // 加入新字段 score
                db.execSQL("ALTER TABLE 'STUDENT' ADD 'SCORE' TEXT;");

                break;
        }

    }
}
