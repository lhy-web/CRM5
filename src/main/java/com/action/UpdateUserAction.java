package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class UpdateUserAction extends ActionSupport {
    private UserService service;
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    private String userName;
    private String userLoginName;
    private String userPassWord;
    private String userTelphone;
    private String userEmail;
    private Integer role;

    public UserService getService() {
        return service;
    }

    public void setService(UserService service) {
        this.service = service;
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

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String execute() throws Exception {
       Boolean b= service.updateUser(userId,userName,userLoginName,userPassWord,userTelphone,userEmail,role);
       if(b==true){
           return "updateSuccess";
       }else {
           ActionContext.getContext().put("updateError","修改失败");
           return "updateFalse";}
    }
}
