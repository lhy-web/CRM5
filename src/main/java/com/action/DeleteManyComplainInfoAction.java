package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.ComplainInfoService;

import java.util.List;

public class DeleteManyComplainInfoAction extends ActionSupport {

    private ComplainInfoService complainInfoService;

    public ComplainInfoService getComplainInfoService() {
        return complainInfoService;
    }

    public void setComplainInfoService(ComplainInfoService complainInfoService) {
        this.complainInfoService = complainInfoService;
    }
    private List<Integer> checkboxDelete;

    public List<Integer> getCheckboxDelete() {
        return checkboxDelete;
    }

    public void setCheckboxDelete(List<Integer> checkboxDelete) {
        this.checkboxDelete = checkboxDelete;
    }

    @Override
    public String execute() throws Exception {
        for (Integer l : checkboxDelete)
            complainInfoService.deleteComplainInfo(l);
        return this.SUCCESS;
    }

}
