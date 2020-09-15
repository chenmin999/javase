package com.igeek.javase.ch02.relation.has;

public class Classes{

    private String label;
    private int size;

    //关联关系：一对多
    private Student[] stus;

    public Classes() {
    }

    public Classes(String label, int size, Student[] stus) {
        this.label = label;
        this.size = size;
        this.stus = stus;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Student[] getStus() {
        return stus;
    }

    public void setStus(Student[] stus) {
        this.stus = stus;
    }

    public void show(){
        System.out.println("班级名称："+label);
        System.out.println("班级容量："+size);

        System.out.println("============学生信息  通过下标操作=============");
        for(int i=0;i<stus.length;i++){
            stus[i].showStudent();
            System.out.println("---------------------");
        }

        System.out.println("============学生信息  通过foreach操作=============");
        for (Student student : stus) {
            student.showStudent();
        }
    }
}
