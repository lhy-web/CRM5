package com.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.domain.RoleInfo;
import com.page.Page;



public class RoleInfoDAOImpl extends HibernateDaoSupport implements RoleInfoDAO{
	private static final Log log = LogFactory.getLog(RoleInfoDAOImpl.class);

	public static final String ROLE_NAME = "roleName";


	public void save(RoleInfo transientInstance) {
		log.debug("saving RoleInfo instance");
		try {
			getHibernateTemplate().getSessionFactory().getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RoleInfo persistentInstance) {
		log.debug("deleting RoleInfo instance");
		try {
			getHibernateTemplate().getSessionFactory().getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}


	public RoleInfo findById(Integer id) {
		log.debug("getting RoleInfo instance with id: " + id);
		try {
			RoleInfo instance = (RoleInfo) getHibernateTemplate().getSessionFactory().getCurrentSession().get(
					"com.domain.RoleInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RoleInfo instance) {
		log.debug("finding RoleInfo instance by example");
		try {
			List results = getHibernateTemplate().getSessionFactory().getCurrentSession()
					.createCriteria("com.domain.RoleInfo").add(
							Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding RoleInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RoleInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}


	public List findByRoleName(Object roleName) {
		return findByProperty(ROLE_NAME, roleName);
	}


	public RoleInfo merge(RoleInfo detachedInstance) {
		log.debug("merging RoleInfo instance");
		try {
			RoleInfo result = (RoleInfo) getHibernateTemplate().getSessionFactory().getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}


	public List findAll(Page page) {
		log.debug("finding all RoleInfo instances");
		try {
			String queryString = "from RoleInfo";
			Query queryObject = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(queryString);
			queryObject.setFirstResult(page.getBeginIndex());
			queryObject.setMaxResults(page.getEveryPage());
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public int findAllCount() {
		log.debug("finding all RoleInfo instances");
		try {
			String queryString = "from RoleInfo";
			Query queryObject = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(queryString);
			return queryObject.list().size();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	
	
}