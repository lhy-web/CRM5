package com.dao;

import com.domain.RoleInfo;
import com.domain.User;

import java.util.List;

public interface UserDao {
    Boolean Login(String userLoginName, String userPassword);

    List<User> getUser(String userLoginName);

    List<User> findAllUser();

    User finUserDetails(Integer userId);

    Boolean addUser(String userName, String userLoginName, String userPassWord, String userTelphone, String userEmail, Integer role);

    Boolean FindRepeatUser(String userLoginName);

    Boolean deleteUserById(Integer userId);

    Boolean updateUser(Integer userId, String userName, String userLoginName, String userPassWord, String userTelphone, String userEmail,Integer role);

    RoleInfo findUserInfo(String role);
}
