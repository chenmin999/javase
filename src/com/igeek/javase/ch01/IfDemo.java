package com.igeek.javase.ch01;


import java.util.Scanner;

/**
 * 需求：if示例,要求从键盘接受两个数字,进行比较,输出较大的数字
 * 提示：import java.util.Scanner;
 * Scanner can=new Scanner(System.in);
 * System.out.println("请输入第一个数：");
 * int d=can.nextInt();
 */
public class IfDemo {

    public static void main(String[] args) {

        //1.获取控制台输入的数字
        //打开扫描器，接受系统输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数值：");
        int a = scanner.nextInt();
        System.out.println("a = "+a);
        System.out.println("请输入第二个数值：");
        int b = scanner.nextInt();
        System.out.println("b = "+b);

        //2.进行比较大小
        if(a>b){
            //3.输出较大数字
            System.out.println("最大值："+a);
        }else{
            System.out.println("最大值："+b);
        }

    }

}
