package com.service;

import com.dao.UserDao;
import com.domain.RoleInfo;
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

    public Boolean addUser(String userName, String userLoginName, String userPassWord, String userTelphone, String userEmail, Integer role) {
        return dao.addUser(userName,userLoginName,userPassWord,userTelphone,userEmail,role);
    }

    public Boolean FindRepeatUser(String userLoginName) {
        return dao.FindRepeatUser(userLoginName);
    }

    public Boolean deleteUserById(Integer userId) {
        return  dao.deleteUserById(userId);
    }

    public Boolean updateUser(Integer userId, String userName, String userLoginName, String userPassWord, String userTelphone, String userEmail, Integer role) {

        return dao.updateUser(userId,userName,userLoginName,userPassWord,userTelphone,userEmail,role);
    }

    public RoleInfo findUserInfo(String role) {
        return dao.findUserInfo(role);
    }


}
