package com.service;


import com.domain.User;

import java.util.List;

public interface UserService {
//登陆
    Boolean Login(String userLoginName,String userPassword);
//获得当前用户用户名
    List<User> getUser(String userLoginName);
}
