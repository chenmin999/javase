package com.igeek.javase.ch03.set;

import java.util.HashSet;

public class PersonHashSetTest {

    public static void main(String[] args) {

        HashSet<Person> set = new HashSet<Person>();

        Person person1 = new Person("张三",25,'男');
        Person person2 = new Person("李四",15,'女');
        Person person3 = new Person("王五",33,'男');
        Person person4 = new Person("王五",33,'男');
        Person person5 = new Person("张三",25,'女');

//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
//        System.out.println(person4);
//        System.out.println(person5);

        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        set.add(person5);

        for (Person person : set) {
            System.out.println(person);
        }
    }

}
