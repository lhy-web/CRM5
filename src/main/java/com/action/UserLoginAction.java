package com.action;

import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

import java.util.List;

public class  UserLoginAction extends ActionSupport {
    private String userLoginName;
    private String userPassWord;
    private UserService service;

    public void setService(UserService service) {
        this.service = service;
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

    @Override
    public String execute() throws Exception {
        Boolean login = service.Login(userLoginName, userPassWord);
        if(login==true){
           List<User> name= service.getUser(userLoginName);
            User user = name.get(0);
            ActionContext.getContext().put("user",user);
            return "LoginSuccess";
        }else {
            ActionContext.getContext().put("LoginFalse","用户名或密码错误,请重新输入");
            return "LoginFalse";}
    }
}
