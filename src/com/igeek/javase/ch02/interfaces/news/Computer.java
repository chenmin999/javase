package com.igeek.javase.ch02.interfaces.news;

public class Computer {

    private IStorage storage;

    public IStorage getStorage() {
        return storage;
    }

    public void setStorage(IStorage storage) {
        this.storage = storage;
    }

    public void readData(){
        System.out.println("电脑读数据");
        storage.read();
    }

    public void writeData(){
        System.out.println("电脑写数据");
        storage.write();
    }
}
