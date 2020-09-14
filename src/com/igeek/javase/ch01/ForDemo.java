package com.igeek.javase.ch01;

/*
 * 1、需求：输出1-100之间的奇数。（for）
 * 2、需求：输出1-100之间的偶数。（for）
 */
public class ForDemo {

    public static void main(String[] args) {

        for(int i=1;i<=100;i++){
            //奇数
            if(i%2!=0){
                System.out.println("奇数："+i);
            }

            //偶数
            if(i%2==0){
                System.out.println("偶数："+i);
            }
        }
    }

}
