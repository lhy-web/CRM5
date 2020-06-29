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

    public List<User> findAllUser() {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="from User";
        Query query = session.createQuery(hql);
        List<User> list = query.list();
        return list;


    }

    public User finUserDetails(Integer userId) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="from User where userId=:userId";
        Query query = session.createQuery(hql);
        query.setParameter("userId",userId);
        User user = (User) query.list().get(0);
        return user;
    }

    public Boolean addUser(String userName, String userLoginName, String userPassWord,
                           String userTelphone, String userEmail, String role) {
        User user = new User(null,userName,userLoginName,userPassWord,userTelphone,userEmail,role);
        try {
            getHibernateTemplate().save(user);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public Boolean FindRepeatUser(String userLoginName) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="from User where userLoginName=:userLoginName";
        Query query = session.createQuery(hql);
        query.setParameter("userLoginName",userLoginName);
        if(query.list().size()==0){
            return true;
        }else return false;
    }
}
