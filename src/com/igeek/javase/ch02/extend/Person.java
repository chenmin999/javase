package com.igeek.javase.ch02.extend;

/**
 练习1：
 创建一个“人”的类，有姓名和年龄，
 有学生和工人继承这个类，他们也有姓名和年龄。
 学生有自己的学习方法，工人有自己的工作方法。
 现在有个学生叫张三，22岁，正在学习，有个工人叫李四，25岁，正在工作。
 */
public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
