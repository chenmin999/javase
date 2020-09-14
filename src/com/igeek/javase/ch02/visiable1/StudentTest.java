package com.igeek.javase.ch02.visiable1;

public class StudentTest {

    public static void main(String[] args) {

        /**
         * 对象实例化的过程：
         * 类  引用名 = new 构造方法();
         * 1.此处使用的是无参构造方法创建对象，Student默认提供无参构造方法
         * 2.一旦Student类中提供了有参构造方法，则不再提供一个无参构造方法
         */
        Student student = new Student();
        student.setName("张三");
        student.setSex("非");
        student.study();

        //有参构造方法
        Student stu = new Student("李四","L001",20,"女");
        stu.study();
    }

}
