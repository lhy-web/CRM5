package com.dao;

import com.domain.TestBean;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class TestDaoImpl extends HibernateDaoSupport implements TestDao{
    public List<TestBean> getList() {
        DetachedCriteria detachedCriteria=DetachedCriteria.forClass(TestBean.class);
        detachedCriteria.add(Restrictions.eq("id",1));
        List<TestBean> list = (List<TestBean>) getHibernateTemplate().findByCriteria(detachedCriteria);
        return list;

    }

}
