package com.action;

import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class UserInfoDetailsAction extends ActionSupport {
    private UserService service ;
    private Integer userId;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setService(UserService service) {
        this.service = service;
    }

    @Override
    public String execute() throws Exception {
        User user = service.findUserDetails(userId);
        ActionContext.getContext().put("user",user);
        return "success";
    }
}
