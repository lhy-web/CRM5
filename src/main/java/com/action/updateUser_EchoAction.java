package com.action;

import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class updateUser_EchoAction extends ActionSupport {
    private UserService service;
    private Integer userId;

    public UserService getService() {
        return service;
    }

    public void setService(UserService service) {
        this.service = service;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    @Override
    public String execute() throws Exception {
        User user = service.findUserDetails(userId);
        ActionContext.getContext().put("user",user);
        return "update";

    }
}
