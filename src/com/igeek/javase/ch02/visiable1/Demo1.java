package com.igeek.javase.ch02.visiable1;

/**
 *  访问权限修饰符      本类中      同包下     不同包下的子类    不同包下的其他类
 *  public              OK         OK           OK              OK
 *  protected           OK         OK           OK
 *  (default)           OK         OK
 *  private             OK
 */
public class Demo1 {

    private String name;

    public void work(){
        System.out.println(name+"正在工作中...");
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.name = "张三";
        d.work();
    }

}
