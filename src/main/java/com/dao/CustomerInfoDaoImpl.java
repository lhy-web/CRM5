package com.dao;

import com.domain.Customerinfo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class CustomerInfoDaoImpl extends HibernateDaoSupport implements CustomerInfoDao {
    public List<Customerinfo> findAll() {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="from Customerinfo";
        Query query=session.createQuery(hql);
        List<Customerinfo> list=query.list();//返回lis结果集
        return list;

    }
}
