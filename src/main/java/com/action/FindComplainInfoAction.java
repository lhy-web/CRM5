package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.page.Page;
import com.page.Result;
import com.service.ComplainInfoService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class FindComplainInfoAction extends ActionSupport {
    private ComplainInfoService complainInfoService;
    private String type;
    private String key;
    private Integer currentPage;

    public ComplainInfoService getComplainInfoService() {
        return complainInfoService;
    }

    public void setComplainInfoService(ComplainInfoService complainInfoService) {
        this.complainInfoService = complainInfoService;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String execute() throws Exception {

        Page page = new Page();
        page.setEveryPage(10);
        if(currentPage==null ||currentPage==0){
            currentPage=1;
        }
        page.setCurrentPage(currentPage);
        Result result = complainInfoService.findComplainInfo(page,type,key);
        HttpServletRequest request=ServletActionContext.getRequest();
        request.setAttribute("findAllComplainInfo", result.getList());
        request.setAttribute("page", result.getPage());
        request.setAttribute("type",type);
        request.setAttribute("key",key);
        return this.SUCCESS;
    }
}
