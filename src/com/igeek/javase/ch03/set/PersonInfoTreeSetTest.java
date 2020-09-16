package com.igeek.javase.ch03.set;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonInfoTreeSetTest {

    public static void main(String[] args) {

        //方法二：让容器自身具备比较性
        TreeSet<PersonInfo> set = new TreeSet<PersonInfo>(new Comparator<PersonInfo>() {
            @Override
            public int compare(PersonInfo o1, PersonInfo o2) {
                if(o1.getName().equals(o2.getName())){
                    if(o1.getAge()==o2.getAge()){
                        return ((Character)o1.getGender()).compareTo(o2.getGender());
                    }
                    return o1.getAge()-o2.getAge();
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        PersonInfo person1 = new PersonInfo("abf",25,'男');
        PersonInfo person2 = new PersonInfo("abb",15,'女');
        PersonInfo person3 = new PersonInfo("abd",35,'男');
        PersonInfo person4 = new PersonInfo("abd",34,'男');
        PersonInfo person5 = new PersonInfo("abd",34,'男');

        //方式一：添加的元素具备比较性  元素必须实现Comparable接口，重写compareTo()
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        set.add(person5);

        for (PersonInfo personInfo : set) {
            System.out.println(personInfo);
        }
    }

}
