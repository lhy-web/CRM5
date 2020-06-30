package com.dao;

import java.util.List;

import com.domain.MenuInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.hibernate.Query;


import org.springframework.orm.hibernate5.support.HibernateDaoSupport;



public class MenuInfoDAOImpl extends HibernateDaoSupport implements MenuInfoDAO {
	private static final Log log = LogFactory.getLog(MenuInfoDAOImpl.class);

	public static final String MENU_INFO_NAME = "menuInfoName";





	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MenuInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MenuInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}


	public List findAll() {
		log.debug("finding all MenuInfo instances");
		try {
			String queryString = "from MenuInfo";
			Query queryObject = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}



}