package com.action;

import com.domain.ComplainInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ComplainInfoService;

public class DeleteComplainInfoAction extends ActionSupport {

    private ComplainInfoService complainInfoService;

    public ComplainInfoService getComplainInfoService() {
        return complainInfoService;
    }

    public void setComplainInfoService(ComplainInfoService complainInfoService) {
        this.complainInfoService = complainInfoService;
    }
    private Integer CustomerInfoId;

    public Integer getCustomerInfoId() {
        return CustomerInfoId;
    }

    public void setCustomerInfoId(Integer customerInfoId) {
        CustomerInfoId = customerInfoId;
    }

    @Override
    public String execute() throws Exception {
        complainInfoService.deleteComplainInfo(CustomerInfoId);
        return this.SUCCESS;
    }
}
