package com.igeek.javase.ch02.extend;

public class Worker extends Person {

    public Worker() {
    }

    public Worker(String name, int age) {
        super(name, age);
    }

    public void work(){
        System.out.println(this.getName()+"正在工作中...");
    }

}
