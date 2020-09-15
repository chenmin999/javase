package com.igeek.javase.ch02.relation.has;

public class PersonTest {

    public static void main(String[] args) {

        Phone phone = new Phone("苹果","白色");

        Person p = new Person("张三",22,phone);

        p.show();
    }

}
