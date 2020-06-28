package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class AddUserAction extends ActionSupport {
    private UserService service;
    public void setService(UserService service) {
        this.service = service;
    }
    private String userName;
    private String userLoginName;
    private String userPassWord;
    private String userTelphone;
    private String userEmail;
    private String role;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    public void setUserTelphone(String userTelphone) {
        this.userTelphone = userTelphone;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String execute() throws Exception {
        Boolean Boolean = service.addUser(userName, userLoginName, userPassWord, userTelphone, userEmail, role);
        if (Boolean==true){
            return "success";
        }else {
            return "false";
        }

    }
}
