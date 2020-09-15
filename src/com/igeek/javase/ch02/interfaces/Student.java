package com.igeek.javase.ch02.interfaces;

/**
 * 1.类实现接口，使用关键字implements
 * 2.类可以实现多个接口，可以使用,来拼接
 * 3.一旦实现接口，要么当前变成抽象类，要么实现所有抽象方法
 */
public class Student implements Person {

    @Override
    public void show() {
        System.out.println("显示");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
