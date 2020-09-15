package com.igeek.javase.ch02.extend;

/**
 练习2：
 1、创建GrandFather类，其中包括
 a)属性：姓名（name），年龄（age）
 b)构造方法：给爷爷的姓名，年龄赋值
 c)方法show()：显示爷爷的信息

 2、创建Father类，继承Grandfather类
 a)属性：除了继承爷爷的属性以外，还要增加自己的属性：“职业”(occupation)
 b)构造方法：显式调用父类的构造方法，为Father类的姓名和年龄赋初始值。再为职业输入初始值
 c)方法show(): 显示父亲的相关信息

 3、创建ClassMain类，定义main()方法，构造GrandFather类的对象和Father类的对象，并分别显示详细信息
 */
public class GrandFather {

    private String name;
    private int age;

    public GrandFather() {
    }

    public GrandFather(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GrandFather show() throws NullPointerException{
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        return null;
    }
}
