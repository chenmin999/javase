package com.igeek.javase.ch01;

import java.util.Scanner;

/**
 * switch  byte short int char JDK1.5枚举  JDK1.7String
 * 需求：
 * switch示例：从键盘接收两个数字,再接收一个符号,然后进行运算.
 * 如果输入的是错误的字符,不进行计算而是提示不存在字符
 * -------请输入第一个数字:8
 * -------请输入第二个数字:9
 * -------请输入运算符号:+
 * -------8+9=17
 */
public class SwitchDemo {

    public static void main(String[] args) {

        //1.获取键盘输入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int i = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int j = sc.nextInt();
        System.out.println("请输入运算符号：");
        String str = sc.next();

        int c = 0;
        //2.判断是否有相应的运算符，并执行相应的操作
        switch (str){
            case "+":
                c = i+j;
                break;
            case "-":
                c = i-j;
                break;
            case "*":
                c = i*j;
                break;
            case "/":
                c = i/j;
                break;
            default:
                //如果输入的是错误的字符,不进行计算而是提示不存在字符
                System.out.println("输入错误运算符号");
                break;
        }

        //3.输出结果
        System.out.println("c = "+c);

    }

}


