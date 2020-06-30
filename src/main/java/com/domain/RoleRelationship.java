package com.domain;

public class RoleRelationship {
    private int roleRelationshipId;
    private Integer access;
    private RoleInfo roleInfo;
    private MenuInfo menuInfo;

    public RoleRelationship() {
    }

    public RoleRelationship(MenuInfo menuInfo, RoleInfo roleInfo, Integer access) {
        this.menuInfo = menuInfo;
        this.roleInfo = roleInfo;
        this.access = access;
    }
    public int getRoleRelationshipId() {
        return roleRelationshipId;
    }

    public void setRoleRelationshipId(int roleRelationshipId) {
        this.roleRelationshipId = roleRelationshipId;
    }


    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }



    public RoleInfo getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(RoleInfo roleInfo) {
        this.roleInfo = roleInfo;
    }

    public MenuInfo getMenuInfo() {
        return menuInfo;
    }

    public void setMenuInfo(MenuInfo menuInfo) {
        this.menuInfo = menuInfo;
    }
}
