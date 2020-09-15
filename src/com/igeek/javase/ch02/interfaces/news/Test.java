package com.igeek.javase.ch02.interfaces.news;

public class Test {

    public static void main(String[] args) {

        Computer computer = new Computer();

        /*IStorage upan = new Upan();
        computer.setStorage(upan);*/

        IStorage mp3 = new Mp3();
        computer.setStorage(mp3);

        computer.readData();
        computer.writeData();
    }

}
