package com.service;

import com.domain.ContactPersonInfo;

import java.util.List;

public interface ContactPersonInfoService {
    public List<ContactPersonInfo> findAll(String name);
    //添加联系人
    void saveContactPersonInfo(ContactPersonInfo contactPersonInfo);
    //删除联系人信息
    Boolean deleteContactPersonInfo(Integer contactPersonInfoId);
    //按条件查询
    ContactPersonInfo getOne(Integer contactPersonInfoId);
    //更新联系人
    void updateContactPersonInfo(ContactPersonInfo contactPersonInfo);
}
