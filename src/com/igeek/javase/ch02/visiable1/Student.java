package com.igeek.javase.ch02.visiable1;

//类
public class Student {

    //属性
    private String name;
    private String num;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, String num, int age, String sex) {
        this.name = name;
        this.num = num;
        this.age = age;
        this.sex = sex;
    }

    //公开的getter和setter方法
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex.equals("男") || sex.equals("女")){
            this.sex = sex;
        }else{
            this.sex ="";
        }
    }

    //方法
    public void study(){
        System.out.println("一名"+sex+"同学名字是"+name+"正在学习。。。");
    }
}
