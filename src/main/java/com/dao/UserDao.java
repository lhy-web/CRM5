package com.dao;

import com.domain.User;

import java.util.List;

public interface UserDao {
    Boolean Login(String userLoginName,String userPassword);

    List<User> getUser(String userLoginName);

    List<User> findAllUser();

    User finUserDetails(Integer userId);

    Boolean addUser(String userName, String userLoginName, String userPassWord, String userTelphone, String userEmail, String role);

    Boolean FindRepeatUser(String userLoginName);
}
