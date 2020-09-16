package com.igeek.javase.ch03.set;

public class PersonInfo /*implements Comparable<PersonInfo>*/ {

    private String name;
    private int age;
    private char gender;

    public PersonInfo() {
    }

    public PersonInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    /*@Override
    public int compareTo(PersonInfo o) {
        if(this.name.equals(o.name)){
            //若姓名相同，年龄也相同，则比较性别
            if(this.age==o.age){
                return ((Character)this.gender).compareTo(o.gender);
            }
            //若姓名相同，则比较年龄
            return this.age - o.age;
        }
        //若姓名不同，则比较姓名
        return this.name.compareTo(o.name);
    }*/
}
