package com.gec.bean;

import java.util.Date;

public class UserFundProduct {
    private Integer id;

    private Integer userid;

    private Integer fundid;

    private Date starttime;

    private Date endtime;

    private Integer status;

    // 一对一的关联引用
    private FundProduct fundProduct;
    private User user;

    public FundProduct getFundProduct() {
        return fundProduct;
    }

    public void setFundProduct(FundProduct fundProduct) {
        this.fundProduct = fundProduct;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "UserFundProduct{" +
                "id=" + id +
                ", userid=" + userid +
                ", fundid=" + fundid +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", status=" + status +
                '}';
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFundid() {
        return fundid;
    }

    public void setFundid(Integer fundid) {
        this.fundid = fundid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}