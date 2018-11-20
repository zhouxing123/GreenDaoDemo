package com.yihui.greendaodemo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 功能详细描述
 *
 * @author: zhouxing
 * @version: [1.0, 2018/11/20]
 * @see: [相关类/方法]
 * @describe: [产品/模块版本]
 */
@Entity
public class TestEntity {

    @Id
    public Long id;
    public String name;
    public String age;
    public String number;
    public String score;
    @Generated(hash = 355063585)
    public TestEntity(Long id, String name, String age, String number,
            String score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.number = number;
        this.score = score;
    }
    @Generated(hash = 1020448049)
    public TestEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return this.age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getScore() {
        return this.score;
    }
    public void setScore(String score) {
        this.score = score;
    }
}
