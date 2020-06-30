package com.test;

import com.dwr.AddRoleInfoAjaxAction;
import com.service.RoleRelationshipService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class Test {
    @Autowired
    private RoleRelationshipService roleRelationshipService;

    @Autowired
    private AddRoleInfoAjaxAction addRoleInfoAjaxAction;

    @org.junit.Test
    public void test() {
        Integer[] a = new Integer[] {1,2,3,4,5,6,7};
        addRoleInfoAjaxAction.saveRoleInfo("jqlk",a);
    }
}