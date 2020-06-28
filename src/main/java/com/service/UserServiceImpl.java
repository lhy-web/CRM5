package com.service;

import com.dao.UserDao;
import com.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class UserServiceImpl implements UserService {
    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public Boolean Login(String userLoginName, String userPassword) {
        return dao.Login(userLoginName, userPassword);
    }

    public List<User> getUser(String userLoginName) {
        return  dao.getUser(userLoginName);
    }
}
