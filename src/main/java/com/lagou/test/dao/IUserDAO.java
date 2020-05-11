package com.lagou.test.dao;

import com.lagou.test.pojo.User;

import java.util.List;

public interface IUserDAO {

    public List<User> findAll();

    public User findByCondition(User user);

}
