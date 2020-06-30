package com.dao;

import com.domain.ContactPersonInfo;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface ContactPersonInfoDAO {
    //查询所有
    List<ContactPersonInfo> findAll(String name);
    //添加联系人信息
    Boolean add(ContactPersonInfo contactPersonInfo);
    //删除联系人
    Boolean deleteContactPerson(Integer contactPersonInfoId);

    // 查询指定联系人
    ContactPersonInfo getOne(Integer contactPersonInfoId);

    // 更新联系人
    void updateContactPersonInfo(ContactPersonInfo contactPersonInfo);


}
