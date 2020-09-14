package com.igeek.javase.ch01;

/*
 * 需求：产生1~10 随机整数
 */
public class RandomDemo {

    public static void main(String[] args) {

        //0~1 [0,1) 随机小数
        double v = Math.random();
        System.out.println("v = "+v);

        //[1,10] 随机整数
        int i = (int)(Math.random()*10+1);
        System.out.println("i = "+i);
    }

}
