package com.igeek.javase.ch02.extend;

/**
 * Java 继承
 * 1.关键字  extends
 * 2.类与类之间是单继承
 * 3.super 代表父类的引用，执行父类中的方法，执行父类中的属性，super()执行父类的构造方法
 * 4.this  代表当前正在创建的对象，或者当前正在使用的对象，执行本类中的方法，本类中的属性，this()执行本类中的构造方法
 */
public class Student extends Person{

    public Student() {
        //调用父类的无参构造方法
        super();
    }

    public Student(String name, int age) {
        //调用父类的有参构造方法
        //super(name, age);
        this();
    }

    public void study(){
        System.out.println(this.getName()+"正在学习中...");
    }

}
