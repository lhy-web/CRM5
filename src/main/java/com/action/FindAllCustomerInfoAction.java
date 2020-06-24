package com.action;

import com.domain.Customerinfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CustomerInfoService;
import com.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import java.util.List;
/*
* 查询全部信息的Action
* */
public class FindAllCustomerInfoAction extends ActionSupport {
    private CustomerInfoService service;
    private String type;
    private Integer currentPage;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    private Integer pageSize;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private String key;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CustomerInfoService getService() {
        return service;
    }

    public void setService(CustomerInfoService service) {
        this.service = service;
    }


    public String findAll() throws Exception {
        //离线查询对象
        DetachedCriteria dc=DetachedCriteria.forClass(Customerinfo.class);
        //前台传入的条件不为空时封装查询对象

        if(key!=null) {
            if (type.equals("customerName")) {
                dc.add(Restrictions.like("customerName","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAll";

            }
            if (type.equals("customerAddress")) {
                dc.add(Restrictions.like("customerAddress","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAll";

            }
            if (type.equals("customerProvinces")) {
                dc.add(Restrictions.like("customerProvinces","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAll";

            }if (type.equals("customerCity")) {
                dc.add(Restrictions.like("customerCity","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAll";

            }
            if (type.equals("customerCode")) {
                dc.add(Restrictions.like("customerCode","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAll";

            }
            if (type.equals("bankAccount")) {
                dc.add(Restrictions.like("bankAccount","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAll";

            }
            if (type.equals("customerCompanyWebsize")) {
                dc.add(Restrictions.like("customerCompanyWebsize","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAll";

            }
            if (type.equals("customerCompanyPhone")) {
                dc.add(Restrictions.like("customerCompanyPhone","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAll";

            }
            if (type.equals("noteInformation")) {
                dc.add(Restrictions.like("noteInformation","%"+key+"%"));

                PageBean pb=service.getPageBean(dc,currentPage,pageSize);
                ActionContext.getContext().put("list",pb);

                return "findAll";

            }
        }else {
            PageBean pb=service.getPageBean(dc,currentPage,pageSize);
            ActionContext.getContext().put("list",pb);}

             return "findAll";

    }
}
