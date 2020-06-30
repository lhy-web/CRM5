package com.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.domain.RoleRelationship;



public class RoleRelationshipDAOImpl extends HibernateDaoSupport implements RoleRelationshipDAO {
	private static final Log log = LogFactory.getLog(RoleRelationshipDAOImpl.class);

	public static final String ACCESS = "access";


	public void save(RoleRelationship transientInstance) {
		log.debug("saving RoleRelationship instance");
		try {
			getHibernateTemplate().getSessionFactory().getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}


	public void delete(RoleRelationship persistentInstance) {
		log.debug("deleting RoleRelationship instance");
		try {
			getHibernateTemplate().getSessionFactory().getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}


	public List findByProperty(String propertyName, Object value) {
		log.debug("finding RoleRelationship instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from RoleRelationship as model where model."
					+ propertyName + "= :value";
			Query queryObject = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(queryString).setParameter("value",value);

			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public void attachDirty(RoleRelationship instance) {
		log.debug("attaching dirty RoleRelationship instance");
		try {
			getHibernateTemplate().getSessionFactory().getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

}