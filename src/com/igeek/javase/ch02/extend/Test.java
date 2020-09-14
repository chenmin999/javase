package com.igeek.javase.ch02.extend;

public class Test {

    public static void main(String[] args) {

        Student stu = new Student("李四",12);
        stu.study();

        Worker worker = new Worker("张三",33);
        worker.work();
    }

}
