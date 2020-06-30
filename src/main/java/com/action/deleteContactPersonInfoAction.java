package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.ContactPersonInfoService;

/*
*删除联系人
 */
public class deleteContactPersonInfoAction extends ActionSupport {
    private Integer ContactPersonInfoId;
    private ContactPersonInfoService service;

    public Integer getContactPersonInfoId() {
        return ContactPersonInfoId;
    }

    public void setContactPersonInfoId(Integer contactPersonInfoId) {
        ContactPersonInfoId = contactPersonInfoId;
    }

    public ContactPersonInfoService getService() {
        return service;
    }

    public void setService(ContactPersonInfoService service) {
        this.service = service;
    }
    @Override
    public String execute() throws Exception {
        Boolean b=service.deleteContactPersonInfo(ContactPersonInfoId);
        if(b==true){
            return "delete";
        }else
            return "false";
    }
}
