package com.igeek.javase.ch02.abstracts;

public class Test {

    public static void main(String[] args) {

        //多态：父类的引用指向子类的实例
        Shape shape = new Circle();
        shape.setName("圆形");
        shape.draw();

        //此时只能使用父类中的方法及属性，不能使用子类中新拓展的方法及属性
        //shape.hello();
    }

}
