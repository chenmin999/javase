package com.igeek.javase.ch03.set;

import java.util.TreeSet;

/**
 * Set 接口
 * 1.不允许重复插入元素，也不会造成覆盖
 * 2.无法保证原来的存储顺序
 *
 * TreeSet 实现类
 * 1.此类不允许使用 null元素，会出现空指针异常
 * 2.线程不安全
 * 3.添加进来的元素进行排序
 */
public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<String>();

        set.add("ddd");
        set.add("eee");
        set.add("bbb");

        for (String s : set) {
            System.out.println(s);
        }
    }

}
