package com.igeek.javase.ch02.test;

import java.util.Arrays;

public class Order {

    private String no;

    //一对一关联 用户
    private User user;

    //一对多关联 商品信息
    private Goods[] goods;

    public Order() {
    }

    public Order(String no, User user, Goods[] goods) {
        this.no = no;
        this.user = user;
        this.goods = goods;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Order{" +
                "no='" + no + '\'' +
                ", user=" + user +
                ", goods=" + Arrays.toString(goods) +
                '}';
    }
}
