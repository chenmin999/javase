package com.igeek.javase.ch02.interfaces;

/**
 * 接口  一套规则
 * 1.关键字  interface
 * 2.不允许出现普通方法，所有方法都是公开的静态的 public abstract
 * 3.不允许出现普通属性，所有属性都是公开的静态的常量
 * 4.不允许出现构造方法
 * 5.不允许进行实例化
 * 6.当作基类存在
 */
public interface Person {

    public static String name = "";

    public abstract void show();
    void eat();

}
