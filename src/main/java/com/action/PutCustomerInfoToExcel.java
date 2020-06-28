package com.action;

import com.domain.Customerinfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CustomerInfoService;
import com.utils.WriteExcel;
import com.utils.getlocalpath;

import java.util.List;

public class PutCustomerInfoToExcel extends ActionSupport {
    private CustomerInfoService service;

    public void setService(CustomerInfoService service) {
        this.service = service;
    }

    @Override
    public String execute() throws Exception {
        List<Customerinfo> list = service.findAll();
        String path1 = getlocalpath.getPath();
        if (path1!=null){
        WriteExcel.write(list,path1);}
        return "put";
    }
}
