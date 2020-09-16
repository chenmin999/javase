package com.igeek.javase.ch03.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 1.List作业
模拟登陆，编写用户类，测试类。
  1>.给集合中存储5个用户对象。
  2>.从控制台输入用户名和密码，和集合中的对象信息进行比较，
  相同表示成功，不同表示失败。
  3>.有三次输入机会。
 */
public class Test {

    public static void main(String[] args) {

        //1.创建集合
        List<User> list = new ArrayList<User>();

        //2.创建5个User对象
        User user1 = new User("张三","111");
        User user2 = new User("李四","222");
        User user3 = new User("王五","333");
        User user4 = new User("王朝","444");
        User user5 = new User("马汉","555");

        //3.添加到集合中
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        //4.获取控制台输入的姓名和密码
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        A:for(int i=0;i<3;i++){
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();

            //5.依次与集合中数据做比较
            B:for (User user : list) {
                if(name.equals(user.getUsername()) && pwd.equals(user.getPassword())){
                    System.out.println("恭喜你，登录成功！");
                    flag = true;
                    break A;
                }
            }
        }

        if(!flag){
            System.out.println("登录失败，下次再来！");
        }

    }

}
