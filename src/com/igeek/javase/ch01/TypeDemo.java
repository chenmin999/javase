package com.igeek.javase.ch01;

/**
 * 基本数据类型
 */
public class TypeDemo {

    public static void main(String[] args) {  //psvm

        //1.自动类型转换：我们将小转大时，可直接转换
        short s1 = 10;
        int i1 = s1;
        System.out.println("i1 = "+i1);  //sout

        //2.强制类型转换：我们将大转小时，不可直接转换，需要强转
        int i2 = 100;
        byte b1 = (byte)i2;
        System.out.println("b1 = "+b1);

        /**
         * 3.整型与浮点之间的转换
         */
        //1).浮点型转整型：强制转换，只保留了整数部分
        double d1 = 12.6;
        int i3 = (int)d1;
        System.out.println("i3 = "+i3);

        //2).整型转浮点型：可直接转换
        int i4 = 25;
        double d2 = i4;
        System.out.println("d2 = "+d2);

        /**
         * 4.整型与字符之间的转换
         *
         *
         */
        //1).整型转成字符型：强制转换，使用Unicode码
        int i5 = 65;
        char c1 = (char)i5;
        System.out.println("c1 = "+c1);

        //2).字符型转成整型：可直接转换
        char c2 = 'a';
        int i6 = c2;
        System.out.println("i6 = "+i6);
    }



}
