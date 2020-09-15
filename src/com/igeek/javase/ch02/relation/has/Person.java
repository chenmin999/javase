package com.igeek.javase.ch02.relation.has;

/**
 * 关联关系：
 * 1.代码复用性
 * 2.has-a
 * 3.代码层面：将一个类作为另外一个类的属性的类型来存在
 */
public class Person {

    private String name;
    private int age;

    //人与手机之间的关系：一对一关联  use-a
    private Phone phone;

    public Person() {
    }

    public Person(String name, int age, Phone phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
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

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void show(){
        System.out.println("名称："+name);
        System.out.println("年龄："+age);
        System.out.println("===========手机信息==========");
        phone.showPhone();
    }
}
