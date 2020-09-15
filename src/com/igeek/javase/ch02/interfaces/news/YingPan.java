package com.igeek.javase.ch02.interfaces.news;

public class YingPan implements IStorage {
    @Override
    public void read(){
        System.out.println("硬盘读...");
    }
    @Override
    public void write(){
        System.out.println("硬盘写...");
    }

}
