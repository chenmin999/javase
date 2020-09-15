package com.igeek.javase.ch02.interfaces.news;

public class Upan implements IStorage {
    @Override
    public void read(){
        System.out.println("U盘读...");
    }
    @Override
    public void write(){
        System.out.println("U盘写...");
    }

}
