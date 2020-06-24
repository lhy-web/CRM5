package com.utils;

import java.util.List;

public class PageBean {
    //当前页
    private Integer currentPage;
    //总页数
    private Integer totalPage;
    //总记录数
    private Integer totalCount;
    //每页记录数
    private Integer pageSize;
    //每页展示集合
    private List list;

    public PageBean(Integer currentPage, Integer totalCount, Integer pageSize) {
        this.currentPage = currentPage;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        //如果当前页为空，则为第一页
        if(this.currentPage==null){
            this.currentPage=1;
        }
        //如果当前页面大小为空，则初始化为6
        if (this.pageSize==null){
            this.pageSize=6;
        }
        //计算总页数
        this.totalPage=(this.totalCount+this.pageSize-1)/this.pageSize;
        //如果当前页小于1，ze变成1
        if(this.currentPage<1){
            this.currentPage=1;
        }
        //如果当前页大于最大页，则当前页等于最大页
        if(this.currentPage>this.totalPage){
            this.currentPage=this.totalPage;
        }

    }
    //获取页列表起始索引
    public Integer getFirst(){
        Integer first=(this.currentPage-1)*this.pageSize;
        return  first;

    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
