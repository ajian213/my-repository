package com.deane.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Deane
 * Date: 2018/10/4
 * Time: 1:30 AM
 */
@Component
@ConfigurationProperties(prefix = "my1")
public class MyProperties1 {
    private int age;
    private String name;

    public MyProperties1() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyProperties1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
