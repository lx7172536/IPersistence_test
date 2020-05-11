package com.lagou.test.pojo;

/**
 * @program: IPersistence
 * @description:
 * @author: lixin
 * @create: 2020-03-31 00:29
 **/
public class User {
    private Integer id;
    private String username;
    private String age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
