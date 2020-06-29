package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class DeleteUserAction extends ActionSupport {
    private UserService service;
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setService(UserService service) {
        this.service = service;
    }

    @Override
    public String execute() throws Exception {
        Boolean b=service.deleteUserById(userId);
        if(b==true){
            return "deleteSuccess";
        }else {
            ActionContext.getContext().put("error","删除失败");
            return "deleteFalse";
        }
    }
}
