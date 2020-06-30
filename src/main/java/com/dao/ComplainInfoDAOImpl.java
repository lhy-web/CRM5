package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.domain.ComplainInfo;
import com.page.Page;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.*;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;


/**
 * A data access object (DAO) providing persistence and search support for
 * ComplainInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see ComplainInfo
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class ComplainInfoDAOImpl extends HibernateDaoSupport implements ComplainInfoDAO {
	private static final Log log = LogFactory.getLog(ComplainInfoDAOImpl.class);

	public void save(ComplainInfo transientInstance) {
		log.debug("saving ComplainInfo instance");
		try {
			Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
			session.save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ComplainInfo persistentInstance) {
		log.debug("deleting ComplainInfo instance");
		try {
			Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
			session.delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ComplainInfo findById(Integer id) {
		log.debug("getting ComplainInfo instance with id: " + id);
		try {
			Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
			ComplainInfo instance = (ComplainInfo) session.get(
					"com.domain.ComplainInfo", id);
			System.out.println(instance);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findCustomerName(Page page, String key) {
		log.debug("getting ComplainInfo instance with customerName: " + key);
		try {
			Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
			String queryString = "from ComplainInfo where customerName='"+key+"'";
			Query queryObject = session.createQuery(queryString);
			queryObject.setFirstResult(page.getBeginIndex());
			queryObject.setMaxResults(page.getEveryPage());
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findCustomerName(String key) {
		log.debug("getting ComplainInfo instance with customerName: " + key);
		try {
			Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
			String queryString = "from ComplainInfo where customerName='"+key+"'";
			Query queryObject = session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ComplainInfo instances");
		try {
			Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
			String queryString = "from ComplainInfo";
			Query queryObject = session.createQuery(queryString);
			List<ComplainInfo> list = queryObject.list();
			return list;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public void attachDirty(ComplainInfo instance) {
		log.debug("attaching dirty ComplainInfo instance");
		try {
			Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
			session.update(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public List findAll(Page page) {
		log.debug("finding all ComplainInfo instances");
		try {
			Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
			String queryString = "from ComplainInfo";
			Query queryObject = session.createQuery(queryString);
			queryObject.setFirstResult(page.getBeginIndex());
			queryObject.setMaxResults(page.getEveryPage());
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public int findAllCount() {
		log.debug("finding all ComplainInfo instances");
		try {
			Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
			String queryString = "from ComplainInfo";
			Query queryObject = session.createQuery(queryString);
			System.out.println(queryObject.list().size());
			return queryObject.list().size();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
}