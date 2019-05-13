package com.zyz.springboot.bean;

/**
 * Created by yongzhou.zhang on 2019/5/13.
 */
public class Dog {
    private String name;
    private Integer age;

    public Dog() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
