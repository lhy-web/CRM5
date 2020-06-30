package com.service;

import com.dao.ContactPersonInfoDAO;
import com.domain.ContactPersonInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class ContactPersonInfoServiceImpl implements ContactPersonInfoService {
    private ContactPersonInfoDAO dao;

    public void setDao(ContactPersonInfoDAO dao) {
        this.dao = dao;
    }
    @Transactional
    public List<ContactPersonInfo> findAll(String name) {
        List<ContactPersonInfo> list = dao.findAll(name);
        return list;
    }
    @Transactional
    public void saveContactPersonInfo(ContactPersonInfo contactPersonInfo) {
        Boolean a = dao.add(contactPersonInfo);
        if (a==true){
            System.out.println("添加成功");
        }else
            System.out.println("添加失败");
    }
    @Transactional
    public Boolean deleteContactPersonInfo(Integer contactPersonInfoId) {
        return dao.deleteContactPerson(contactPersonInfoId);
    }

    public ContactPersonInfo getOne(Integer contactPersonInfoId) {
        return dao.getOne(contactPersonInfoId);
    }

    @Override
    public void updateContactPersonInfo(ContactPersonInfo contactPersonInfo) {
        dao.updateContactPersonInfo(contactPersonInfo);
    }


}
