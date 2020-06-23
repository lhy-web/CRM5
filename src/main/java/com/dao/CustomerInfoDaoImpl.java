package com.dao;

import com.domain.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

public class CustomerInfoDaoImpl extends HibernateDaoSupport implements CustomerInfoDao {
    public List<Customerinfo> findAll() {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="from Customerinfo";
        Query query=session.createQuery(hql);
        List<Customerinfo> list=query.list();//返回lis结果集
        return list;

    }

    public Boolean add(Customerinfo customerinfo) {
        try {
            getHibernateTemplate().save(customerinfo);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public List<CustomerLevel> getCustomerLevel() {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="from CustomerLevel";
        Query query = session.createQuery(hql);
        List<CustomerLevel> list = query.list();
        return list;
    }

    public List<DictionaryTypeInfo> getCustomerProperties() {
        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(DictionaryTypeInfo.class);
        detachedCriteria.add(Restrictions.eq("dictionaryType",new DictionaryType(2,"企业性质-分类")));
        List<DictionaryTypeInfo> list = (List<DictionaryTypeInfo>) getHibernateTemplate().findByCriteria(detachedCriteria);

        return list;
    }

    public List<DictionaryTypeInfo> getCustomerType() {
        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(DictionaryTypeInfo.class);
        detachedCriteria.add(Restrictions.eq("dictionaryType",new DictionaryType(1,"企业类型-分类")));
        List<DictionaryTypeInfo> list = (List<DictionaryTypeInfo>) getHibernateTemplate().findByCriteria(detachedCriteria);

        return list;
    }

    public List<DictionaryTypeInfo> getCustomerOpenBank() {
        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(DictionaryTypeInfo.class);
        detachedCriteria.add(Restrictions.eq("dictionaryType",new DictionaryType(3,"开户银行-分类")));
        List<DictionaryTypeInfo> list = (List<DictionaryTypeInfo>) getHibernateTemplate().findByCriteria(detachedCriteria);

        return list;
    }

    public List<DictionaryTypeInfo> getCustomerSource() {
        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(DictionaryTypeInfo.class);
        detachedCriteria.add(Restrictions.eq("dictionaryType",new DictionaryType(4,"信息来源-分类")));
        List<DictionaryTypeInfo> list = (List<DictionaryTypeInfo>) getHibernateTemplate().findByCriteria(detachedCriteria);

        return list;
    }

    public boolean getChongfu(String customerName) {
        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(Customerinfo.class);
        detachedCriteria.add(Restrictions.eq("customerName",customerName));
        List<Customerinfo> list = (List<Customerinfo>) getHibernateTemplate().findByCriteria(detachedCriteria);
        if(list.isEmpty()==true){
            return false;
        }else
            return true;
    }
}
