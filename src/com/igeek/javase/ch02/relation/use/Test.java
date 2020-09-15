package com.igeek.javase.ch02.relation.use;

public class Test {

    public static void main(String[] args) {

        Bus bus = new Bus("公交车",1);

        Person p = new Person("王朝",101);

        p.work(bus);

    }

}
