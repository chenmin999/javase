package com.igeek.javase.ch02.extend;

public class Father extends GrandFather {

    private String occupation;

    public Father(String name, int age, String occupation) {
        super(name, age);
        this.occupation = occupation;
    }

    public Father() {
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * 方法重写发生在继承中，有父类和子类一说。
     * 1).方法名相同
     * 2).方法的返回值相同（基本数据类型）；对于引用数据类型，子类的要比父类的小；子类<=父类
     * 如：类型：Person>Student ; Father>Son;
     * 3).子类的修饰符范围要比父类的要大；public>protected>(default)>private
     * 4).方法的参数列表要相同；
     * 5).子类抛出的异常要比父类方法抛出的异常要小;Exception>RuntimeException>NullPointException
     */
    @Override
    public void show(){
        super.show();
        System.out.println("职业："+occupation);
    }
}
