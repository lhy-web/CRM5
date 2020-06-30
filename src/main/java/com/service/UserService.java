package com.service;


import com.domain.RoleInfo;
import com.domain.User;

import java.util.List;

public interface UserService {
//登陆
    Boolean Login(String userLoginName, String userPassword);
//获得当前用户用户名
    List<User> getUser(String userLoginName);
//展示用户信息
    List<User> findAllUser();
//展示用户详细信息
    User findUserDetails(Integer userId);
//用户添加
    Boolean addUser(String userName, String userLoginName, String userPassWord, String userTelphone, String userEmail, Integer role);

    Boolean FindRepeatUser(String userLoginName);

    Boolean deleteUserById(Integer userId);

    Boolean updateUser(Integer userId, String userName, String userLoginName, String userPassWord, String userTelphone, String userEmail, Integer role);

    RoleInfo findUserInfo(String role);
}
