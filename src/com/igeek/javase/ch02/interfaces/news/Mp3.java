package com.igeek.javase.ch02.interfaces.news;

public class Mp3 implements IStorage {
    @Override
    public void read(){
        System.out.println("Mp3读...");
    }
    @Override
    public void write(){
        System.out.println("Mp3写...");
    }

    public void playMusic(){
        System.out.println("播放音乐");
    }

}
