package com.igeek.javase.ch02.relation.use;

/**
 * 依赖关系
 * 1.use-a
 * 2.偶然性，临时性
 * 3.代码层面：一个类作为另外一个类的方法的形参类型使用
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

    //依赖关系：use-a  偶然性，临时性
    public void work(Bus bus){
        System.out.println(name+"搭乘"+bus.getLabel()+"上班");
    }
}
