package com.igeek.javase.ch02.relation.has;

public class StudentTest {

    public static void main(String[] args) {

        Student stu1 = new Student("张三","L001");
        Student stu2 = new Student("李四","L002");
        Student[] stus = {stu1,stu2};

        Classes clas = new Classes("信管专业",50,stus);

        clas.show();
    }

}
