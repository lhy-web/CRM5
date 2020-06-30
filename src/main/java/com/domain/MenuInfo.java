package com.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MenuInfo {
    private int menuInfoId;
    private String menuInfoName;
   // private Collection<RoleRelationship> roleRelationships;
   private Set roleRelationships = new HashSet(0);

    public MenuInfo() {
    }


    public MenuInfo(String menuInfoName, Set roleRelationships) {
        this.menuInfoName = menuInfoName;
        this.roleRelationships = roleRelationships;
    }
    public int getMenuInfoId() {
        return menuInfoId;
    }

    public void setMenuInfoId(int menuInfoId) {
        this.menuInfoId = menuInfoId;
    }

    public String getMenuInfoName() {
        return menuInfoName;
    }

    public void setMenuInfoName(String menuInfoName) {
        this.menuInfoName = menuInfoName;
    }

//    public Collection<RoleRelationship> getRoleRelationships() {
//        return roleRelationships;
//    }
//
//    public void setRoleRelationships(Collection<RoleRelationship> roleRelationships) {
//        this.roleRelationships = roleRelationships;
//    }

    public Set getRoleRelationships() {
        return this.roleRelationships;
    }

    public void setRoleRelationships(Set roleRelationships) {
        this.roleRelationships = roleRelationships;
    }
}
