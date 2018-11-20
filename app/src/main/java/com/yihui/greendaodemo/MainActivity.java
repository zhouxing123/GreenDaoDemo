package com.yihui.greendaodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.inst.greendao3_demo.dao.TestEntityDao;

import java.util.List;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestEntityDao testEntityDao = DbCore.getDaoSession().getTestEntityDao();
        TestEntity testEntity = new TestEntity(1L,"222","13","11","22");

        testEntityDao.insert(testEntity);
        List<TestEntity> list = testEntityDao.loadAll();
        Log.e("-------------",list.get(0).getAge());
    }
}
