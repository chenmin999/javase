package com.igeek.javase.ch02.relation.has;

public class Student {

    private String name;
    private String num;

    public Student() {
    }

    public Student(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void showStudent(){
        System.out.println("姓名："+name);
        System.out.println("学号："+num);
    }
}
