package com.dao;

import com.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    public Boolean Login(String userLoginName, String userPassword) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="from User where userLoginName=:name and userPassWord=:pwd";
        Query query = session.createQuery(hql);
        query.setParameter("name",userLoginName);
        query.setParameter("pwd",userPassword);
        if(query.list().size()==0){
            return false;
        }else
            return true;

    }

    public List<User> getUser(String userLoginName) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="from User where userLoginName=:name";
        Query query = session.createQuery(hql);
        query.setParameter("name",userLoginName);
        List<User> list = query.list();
        return list;
    }
}
