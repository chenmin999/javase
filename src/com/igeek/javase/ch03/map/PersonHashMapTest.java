package com.igeek.javase.ch03.map;

import java.util.HashMap;
import java.util.Set;

public class PersonHashMapTest {

    public static void main(String[] args) {

        HashMap<Person,String> map = new HashMap<Person,String>();

        Person person1 = new Person("张三",25,'男');
        Person person2 = new Person("李四",15,'女');
        Person person3 = new Person("王五",33,'男');
        Person person4 = new Person("王五",33,'男');
        Person person5 = new Person("张三",25,'女');

        map.put(person1,person1.getName());
        map.put(person2,person2.getName());
        map.put(person3,person3.getName());
        map.put(person4,person4.getName());
        map.put(person5,person5.getName());

        Set<Person> keys = map.keySet();
        for (Person key : keys) {
            System.out.println("key = "+key+" , value = "+map.get(key));
        }
    }

}
