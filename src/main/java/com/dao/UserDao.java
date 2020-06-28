package com.dao;

import com.domain.User;

import java.util.List;

public interface UserDao {
    Boolean Login(String userLoginName,String userPassword);

    List<User> getUser(String userLoginName);
}
