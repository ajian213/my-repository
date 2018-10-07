package com.deane.entity;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Deane
 * Date: 2018/10/6
 * Time: 2:49 AM
 */
public class UserBatis implements Serializable {

    private static final long serialVersionUID = 8655851615465363473L;

    private Long id;
    private String name;
    private String password;

    public UserBatis() {

    }

    public UserBatis(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public UserBatis( Long id, String name, String password ) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
