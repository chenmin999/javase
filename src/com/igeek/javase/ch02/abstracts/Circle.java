package com.igeek.javase.ch02.abstracts;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("画"+this.getName());
    }

    public void hello(){
        System.out.println("hello "+this.getName());
    }

}
