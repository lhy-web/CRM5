package com.action;

import com.opensymphony.xwork2.ActionContext;
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
    private Integer role;

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

    public UserService getService() {
        return service;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public String getUserTelphone() {
        return userTelphone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String execute() throws Exception {
        Boolean b=service.FindRepeatUser(userLoginName);
        if(b==true){
            Boolean Boolean = service.addUser(userName, userLoginName, userPassWord, userTelphone, userEmail, role);
            if (Boolean==true){
                return "success";
            }else {
                return "false";
            }
        }else {
            ActionContext.getContext().put("repeat","用户名重复");
            return "repeat";
        }

    }
}
