package com.action;

import com.domain.ContactPersonInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ContactPersonInfoService;
import com.utils.WritePersonExcel;
import com.utils.getlocalpath;

import java.util.List;

public class PutContactPersonInfoExcel extends ActionSupport {
    private ContactPersonInfoService service;

    public void setService(ContactPersonInfoService service) {
        this.service = service;
    }
    @Override
    public String execute() throws Exception{
        String name = new String();
        List<ContactPersonInfo> list = service.findAll(name);
        String path1 = getlocalpath.getPath();
        if (path1!=null){
            WritePersonExcel.write(list,path1);}
        return "put";
    }

}
