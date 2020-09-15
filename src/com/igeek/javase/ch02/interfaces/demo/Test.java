package com.igeek.javase.ch02.interfaces.demo;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Upan upan = new Upan();
        Mp3 mp3 = new Mp3();

        //将U盘插入电脑
        computer.setUpan(upan);
        computer.setMp3(mp3);

        //进行读写操作
        computer.readData();
        computer.writeData();
    }

}
