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

    public List<User> findAllUser() {
        return dao.findAllUser();
    }

    public User findUserDetails(Integer userId) {
        return dao.finUserDetails(userId);
    }

    public Boolean addUser(String userName, String userLoginName, String userPassWord, String userTelphone, String userEmail, String role) {
        return dao.addUser(userName,userLoginName,userPassWord,userTelphone,userEmail,role);
    }

    public Boolean FindRepeatUser(String userLoginName) {
        return dao.FindRepeatUser(userLoginName);
    }


}
