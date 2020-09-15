package com.igeek.javase.ch02.test;

import java.util.Date;

public class Goods {

    private String name;
    private double price;
    private String detail;
    private Date creattime;

    public Goods() {
    }

    public Goods(String name, double price, String detail, Date creattime) {
        this.name = name;
        this.price = price;
        this.detail = detail;
        this.creattime = creattime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }


    //未发生重写toString，输出：全类名@hashcode码值
    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", creattime=" + creattime +
                '}';
    }
}
