package com.dao;

import com.domain.RoleInfo;
import com.domain.User;
import com.domain.UserInfo;
import org.apache.poi.hssf.record.DVALRecord;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    public Boolean Login(String userLoginName, String userPassword) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="from UserInfo where userLoginName=:name and userPassWord=:pwd";
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
        String hql="select u.userId,u.userName,u.userLoginName,u.userPassWord,u.userTelphone,u.userEmail,r.roleName as role from user u,roleinfo r where u.role=r.roleId and u.userLoginName=:name";
        SQLQuery query=session.createSQLQuery(hql);
        query.setParameter("name",userLoginName);
        query.addEntity(User.class);
        List<User> list = query.list();
        return list;
    }

    public List<User> findAllUser() {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="select u.userId,u.userName,u.userLoginName,u.userPassWord,u.userTelphone,u.userEmail,r.roleName as role from user u,roleinfo r where u.role=r.roleId";
        SQLQuery query=session.createSQLQuery(hql);
        query.addEntity(User.class);
        List<User> list = query.list();
        return list;


    }

    public User finUserDetails(Integer userId) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="select u.userId,u.userName,u.userLoginName,u.userPassWord,u.userTelphone,u.userEmail,r.roleName as role from user u,roleinfo r where u.role=r.roleId and u.userId=:userId";
        SQLQuery query=session.createSQLQuery(hql);
        query.setParameter("userId",userId);
        query.addEntity(User.class);
        User user = (User) query.list().get(0);
        return user;
    }

    public Boolean addUser(String userName, String userLoginName, String userPassWord,
                           String userTelphone, String userEmail, Integer role) {
        UserInfo user = new UserInfo(null,userName,userLoginName,userPassWord,userTelphone,userEmail,role);
        try {
            getHibernateTemplate().save(user);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public Boolean FindRepeatUser(String userLoginName) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="from UserInfo where userLoginName=:userLoginName";
        Query query = session.createQuery(hql);
        query.setParameter("userLoginName",userLoginName);
        if(query.list().size()==0){
            return true;
        }else return false;
    }

    public Boolean deleteUserById(Integer userId) {
        try {
            Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
            UserInfo  user = session.get(UserInfo.class, userId);
            session.delete(user);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public Boolean updateUser(Integer userId, String userName, String userLoginName, String userPassWord, String userTelphone, String userEmail, Integer role) {
        try {
            Session currentSession = getHibernateTemplate().getSessionFactory().getCurrentSession();
            UserInfo user = currentSession.get(UserInfo.class, userId);
            user.setUserName(userName);
            user.setUserLoginName(userLoginName);
            user.setUserPassWord(userPassWord);
            user.setUserTelphone(userTelphone);
            user.setUserEmail(userEmail);
            user.setRole(role);
            currentSession.update(user);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public RoleInfo findUserInfo(String role) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql="from RoleInfo where roleName=:role";
        Query query = session.createQuery(hql);
        query.setParameter("role",role);
        RoleInfo roleInfo = (RoleInfo) query.list().get(0);
        return roleInfo;
    }
}
