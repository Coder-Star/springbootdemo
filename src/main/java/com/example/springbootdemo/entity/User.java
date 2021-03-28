package com.example.springbootdemo.entity;

import java.io.Serializable;
/**
 * @author litianxing
 * @date  2020/5/27
 * @description
*/
public class User implements Serializable {

    private static final long serialVersionUID = -3278158729088370999L;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
