package com.igeek.javase.ch01;

/*
 * 1、需求：编写从1-100之间的奇数的和，显示结果。（while）
 */
public class WhileDemo1 {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        while(i<=100){
            if(i%2!=0){
                sum += i;  //sum=sum+i;
            }
            i++;
        }
        System.out.println("和："+sum);
    }

}
