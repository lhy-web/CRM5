package com.domain;

import java.io.Serializable;

public class User implements Serializable {
    private Integer userId;
    private String userName;
    private String userLoginName;
    private String userPassWord;
    private String userTelphone;
    private String userEmail;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User(Integer userId, String userName, String userLoginName, String userPassWord, String userTelphone, String userEmail, String role) {
        this.userId = userId;
        this.userName = userName;
        this.userLoginName = userLoginName;
        this.userPassWord = userPassWord;
        this.userTelphone = userTelphone;
        this.userEmail = userEmail;
        this.role = role;
    }

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    public String getUserTelphone() {
        return userTelphone;
    }

    public void setUserTelphone(String userTelphone) {
        this.userTelphone = userTelphone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
