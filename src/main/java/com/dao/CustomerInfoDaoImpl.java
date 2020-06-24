package com.dao;

import com.domain.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
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

    public Customerinfo findById(Integer customerInfoId) {
        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(Customerinfo.class);
        detachedCriteria.add(Restrictions.eq("customerId",customerInfoId));
        List<Customerinfo> list = (List<Customerinfo>) getHibernateTemplate().findByCriteria(detachedCriteria);
     if(list.size()!=0){
        Customerinfo c=list.get(0);
        return c;}
     else return null;

    }

    public Boolean updateCustomer(Customerinfo customerInfo) {
        try {


        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        Customerinfo c = session.get(Customerinfo.class, customerInfo.getCustomerId());
        c.setCustomerName(customerInfo.getCustomerName());
        c.setBankAccount(customerInfo.getBankAccount());
        c.setCustomerAddress(customerInfo.getCustomerAddress());
        c.setCustomerCity(customerInfo.getCustomerCity());
        c.setCustomerCode(customerInfo.getCustomerCode());
        c.setCustomerCompanyPhone(customerInfo.getCustomerCompanyPhone());
        c.setCustomerCompanyWebsize(customerInfo.getCustomerCompanyWebsize());
        c.setCustomerLevel(customerInfo.getCustomerLevel());
        c.setDictionaryTypeInfoByCustomerProperties(customerInfo.getDictionaryTypeInfoByCustomerProperties());
        c.setDictionaryTypeInfoByCustomerSource(customerInfo.getDictionaryTypeInfoByCustomerSource());
        c.setDictionaryTypeInfoByCustomerType(customerInfo.getDictionaryTypeInfoByCustomerType());
        c.setDictionaryTypeInfoByOpenBank(customerInfo.getDictionaryTypeInfoByOpenBank());
        c.setNoteInformation(customerInfo.getNoteInformation());
        c.setRegister(customerInfo.getRegister());
        c.setCustomerProvinces(customerInfo.getCustomerProvinces());
        session.update(c);
        return true;}catch (Exception e){
            System.out.println(e);
            return false;
        }



    }

    public Boolean deleteCustomer(Integer customerInfoId) {
        try {
            Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
            Customerinfo customerinfo = session.get(Customerinfo.class, customerInfoId);
            session.delete(customerinfo);
            return true;
        }catch (Exception e){
            return false;
        }
    }


//条件分页获取总条数
    public Integer getTotalCount(DetachedCriteria dc) {
        dc.setProjection(Projections.rowCount());
        List list= getHibernateTemplate().findByCriteria(dc);
        dc.setProjection(null);
        if(list!=null&&list.size()>0){
            Long a= (Long) list.get(0);
            return  a.intValue();
        }else
            return 0;
    }

    public List<Customerinfo> getList(DetachedCriteria dc, Integer first, Integer pageSize) {
        return (List<Customerinfo>) getHibernateTemplate().findByCriteria(dc,first, pageSize);
    }
}
