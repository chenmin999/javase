package com.igeek.javase.ch03;

/**
 * 泛型
 * 1.语法： <任意大写字母>
 * 2.充当任意数据类型使用，将来使用之前必须给定具体的类型，类型只能是引用数据类型
 * 3.泛型类型，可以声明任意多个大写字母
 * 4.静态的方法中不可以使用泛型
 * 5.集合框架中的泛型使用 List<K>，在定义接口中会经常使用
 */
public class Gen<T,E,K> {

    private T name;
    private E age;
    private K gender;

    public Gen() {
    }

    public Gen(T name, E age, K gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }

    public K getGender() {
        return gender;
    }

    public void setGender(K gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Gen{" +
                "name=" + name +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    //int --> Integer  char --> Character
    public static void main(String[] args) {
        //Gen<T,E,K> gen = new Gen<T,E,K>();
        Gen<String,Integer,Character> gen = new Gen<String,Integer,Character>("张三",12,'男');
        System.out.println(gen);
    }
}
