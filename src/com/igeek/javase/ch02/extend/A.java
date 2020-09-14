package com.igeek.javase.ch02.extend;

public class A {
    public A(){
        super();
        System.out.println("this = "+this);
        this.show();
    }

    public void show(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        super();
        this.show();
    }

    public void show(){
        System.out.println("B");
    }
}
class C extends B{
    public C(){
        super();
        this.show();
    }

    public void show(){
        System.out.println("C");
    }
}
