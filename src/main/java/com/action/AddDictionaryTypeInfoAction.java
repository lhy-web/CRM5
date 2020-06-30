package com.action;

import com.domain.DictionaryType;
import com.domain.DictionaryTypeInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.DictionaryTypeService;
import com.service.DictionaryTypeServiceImpl;

public class AddDictionaryTypeInfoAction extends ActionSupport {
    private DictionaryTypeService service;

    private DictionaryTypeInfo dictionaryTypeInfo;

    public DictionaryTypeService getService() {
        return service;
    }

    public void setService(DictionaryTypeService service) {
        this.service = service;
    }

    public DictionaryTypeInfo getDictionaryTypeInfo() {
        return dictionaryTypeInfo;
    }

    public void setDictionaryTypeInfo(DictionaryTypeInfo dictionaryTypeInfo) {
        this.dictionaryTypeInfo = dictionaryTypeInfo;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(dictionaryTypeInfo.getDataInformationName()+dictionaryTypeInfo.getDictionaryType());
        service.saveDictionaryTypeInfo(dictionaryTypeInfo);
        return this.SUCCESS;
    }
}
