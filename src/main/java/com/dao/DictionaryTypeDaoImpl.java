package com.dao;

import com.domain.DictionaryType;
import com.domain.DictionaryTypeInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.dao.DictionaryTypeDao;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public class DictionaryTypeDaoImpl extends HibernateDaoSupport  implements  DictionaryTypeDao {
    public List<DictionaryType> findAll() {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql = "from DictionaryType";
        Query query = session.createQuery(hql);
        List<DictionaryType> list = query.list();//返回lis结果集
        return list;

    }
    private static final Log log = LogFactory.getLog(DictionaryTypeDaoImpl.class);
    public static final String COMPLAIN_PERSON = "datatypeName";
    public void save(DictionaryType transientInstance) {
        log.debug("saving DictionaryType instance");
        try {
            Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
            session.save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }

    public List<DictionaryTypeInfo> selectDictionaryTypeInfo(Integer id) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        String hql = "from DictionaryTypeInfo where dictionaryType="+id;
        Query query = session.createQuery(hql);
        List<DictionaryTypeInfo> list = query.list();//返回lis结果集
        return list;
    }

    public void save(DictionaryTypeInfo transientInstance) {
        log.debug("saving DictionaryTypeInfo instance");
        try {
            Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
            session.save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }

    public void delete(Integer id) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        session.delete(new DictionaryType(id));
    }

    public void deleteDictionaryTypeInfo(Integer id) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        session.delete(new DictionaryTypeInfo(id));
    }

    public void update(DictionaryType dictionaryType) {
        try {
            Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
            session.update(dictionaryType);
           }catch (Exception e){
            System.out.println(e);

        }



    }

    public void update(DictionaryTypeInfo dictionaryType) {
        Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
        session.update(dictionaryType);
    }
}