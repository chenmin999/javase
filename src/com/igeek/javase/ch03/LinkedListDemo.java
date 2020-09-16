package com.igeek.javase.ch03;

import java.util.LinkedList;

/**
 * LinkedList
 * 1.基于链表原理
 * 2.操作分头分尾操作
 * 3.查询慢，增删快
 * 4.线程不安全
 */
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("false");
        list.addLast("hello");
        list.addFirst("abc");
        for (String s : list) {
            System.out.println(s);
        }

        list.removeFirst();
        System.out.println("=================");
        for (String s : list) {
            System.out.println(s);
        }
    }

}
