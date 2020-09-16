package com.igeek.javase.ch03.set;

import java.util.HashSet;

/**
 * Set 接口
 * 1.不允许重复插入元素，也不会造成覆盖
 * 2.无法保证原来的存储顺序
 *
 * HashSet
 * 1.底层是以哈希表实现的
 * 2.此类允许使用 null元素
 * 3.线程不安全
 * 4.存取速度快
 * 5.若hashcode值一样，仍然需要比较equals；若equals返回true，则无需比较hashcode值
 */
public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("adf");
        set.add("adc");
        set.add("abb");

        for (String s : set) {
            System.out.println("s = "+s);
        }
    }

}
