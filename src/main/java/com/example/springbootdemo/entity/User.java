package com.example.springbootdemo.entity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -3278158729088370999L;
    private  String name; //姓名
    private  String sex; // 性别

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
