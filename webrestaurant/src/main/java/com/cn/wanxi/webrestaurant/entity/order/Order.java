package com.cn.wanxi.webrestaurant.entity.order;

import javax.persistence.Column;

public class Order {
    private int id;

    @Column(name = "u_phone")
    private String uphone;

    @Column(name = "d_id")
    private int dId;

    @Column(name = "t_id")
    private int tId;

    @Column(name = "order_time")
    private String orderTime;

    private String payable;

    @Column(name = "actually_paid")
    private String actuallyPaid;

    private String discount;
    private int del;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getPayable() {
        return payable;
    }

    public void setPayable(String payable) {
        this.payable = payable;
    }

    public String getActuallyPaid() {
        return actuallyPaid;
    }

    public void setActuallyPaid(String actuallyPaid) {
        this.actuallyPaid = actuallyPaid;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }
}
