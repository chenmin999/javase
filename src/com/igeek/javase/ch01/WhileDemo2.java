package com.igeek.javase.ch01;

import java.util.Scanner;

/*
 * 2、需求：接受键盘的输入,如果输入的exit就退出，否则提示用户继续输入!（while）
 */
public class WhileDemo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String str = sc.next();

        while(true){
            if(str.equals("exit")){
                break;
            }
            System.out.println("str = "+str);
            System.out.println("再次输入：");
            str = sc.next();
        }

    }

}
