package com.igeek.javase.ch02.abstracts;

/**
 * 抽象类   abstract class
 * 1.允许存在非抽象的方法
 * 2.允许存在属性
 * 3.允许存在构造方法
 * 4.只能够作为基类存在，不允许实例化抽象类
 * 5.子类一旦继承抽象类，要么子类自己变成抽象类，要么实现抽象方法
 *
 * 抽象方法
 */
public abstract class Shape {

    private String name;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 抽象方法
     * 1.一旦一个类中有抽象方法，则当前类必须是抽象类
     * 2.abstract 修饰符
     * 3.抽象方法没有方法体
     */
    public abstract void draw();
}
