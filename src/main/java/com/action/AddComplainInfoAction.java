package com.action;

import com.domain.ComplainInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ComplainInfoService;

public class AddComplainInfoAction extends ActionSupport {
    private ComplainInfoService complainInfoService;

    public ComplainInfoService getComplainInfoService() {
        return complainInfoService;
    }

    public void setComplainInfoService(ComplainInfoService complainInfoService) {
        this.complainInfoService = complainInfoService;
    }
    private ComplainInfo complainInfo;

    public ComplainInfo getComplainInfo() {
        return complainInfo;
    }

    public void setComplainInfo(ComplainInfo complainInfo) {
        this.complainInfo = complainInfo;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(complainInfo);
        complainInfoService.saveComplainInfo(complainInfo);
        return this.SUCCESS;
    }
}
