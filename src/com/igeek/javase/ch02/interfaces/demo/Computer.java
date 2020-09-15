package com.igeek.javase.ch02.interfaces.demo;

public class Computer {

    private Upan upan;
    private Mp3 mp3;
    private YingPan yingPan;

    public Upan getUpan() {
        return upan;
    }

    //插入U盘
    public void setUpan(Upan upan) {
        this.upan = upan;
    }

    public Mp3 getMp3() {
        return mp3;
    }

    public void setMp3(Mp3 mp3) {
        this.mp3 = mp3;
    }

    public YingPan getYingPan() {
        return yingPan;
    }

    public void setYingPan(YingPan yingPan) {
        this.yingPan = yingPan;
    }

    public void readData(){
        System.out.println("读数据....");
//        upan.read();
        mp3.read();
    }

    public void writeData(){
        System.out.println("写数据...");
//        upan.write();
        mp3.write();
    }

}
