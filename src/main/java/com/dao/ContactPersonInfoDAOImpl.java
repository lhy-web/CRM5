package com.dao;


import com.domain.ContactPersonInfo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;


public class ContactPersonInfoDAOImpl extends HibernateDaoSupport implements ContactPersonInfoDAO {
    @Override
    public List<ContactPersonInfo> findAll(String name) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql;
        Query query;
        if (name != null && !"".equals(name.trim())){
            hql = "from ContactPersonInfo as person where person.contactName like :contactName";
            query = session.createQuery(hql);
            query.setString("contactName", "%"+name+"%");
        } else {
            hql = "from ContactPersonInfo ";
            query = session.createQuery(hql);
        }
        List<ContactPersonInfo> list=query.list();
        return list;
    }
    @Override
    public Boolean add(ContactPersonInfo contactPersonInfo) {
        try{
            Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
            session.save(contactPersonInfo);
            return true;
        }catch (Exception e){
            return false;
        }

    }
    @Override
    public Boolean deleteContactPerson(Integer contactPersonInfoId) {
        try {
            Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
            ContactPersonInfo contactPersonInfo = session.get(ContactPersonInfo.class,contactPersonInfoId);
            session.delete(contactPersonInfo);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 查询一个联系人
     * @param contactPersonInfoId
     * @return
     */
    @Override
    public ContactPersonInfo getOne(Integer contactPersonInfoId) {

            return getHibernateTemplate().getSessionFactory().openSession().get(ContactPersonInfo.class,contactPersonInfoId);

    }

    @Override
    public void updateContactPersonInfo(ContactPersonInfo contactPersonInfo) {
            Session session = getHibernateTemplate().getSessionFactory().openSession();
            session.update(contactPersonInfo);
            session.flush();

    }



}