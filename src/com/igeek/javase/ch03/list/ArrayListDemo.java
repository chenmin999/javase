package com.igeek.javase.ch03.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * List
 * 1.保证原来的存储顺序
 * 2.允许存储null值
 * 3.允许重复插入
 *
 * ArrayList
 * 1.基于数组的原理，空间内存是连续的
 * 2.通过下标进行操作
 * 3.查询速度快
 * 4.增删（进行数组的扩容及拷贝）较慢
 * 5.线程不安全
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<Object>();

        //添加方法
        list.add("张三");
        list.add(111);
        list.add(111);
        list.add(null);
        list.add('女');
        list.add(false);

        //获取方法
        System.out.println(list.get(0));

        //通过下标迭代
        System.out.println("============通过下标迭代=============");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=============通过foreach迭代============");
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("===========通过集合的迭代器===========");
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("===========移除元素==========");
        //移除元素  下标从0开始，到size-1结束
        list.remove(null);
        list.remove(list.size()-1);
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("===========数组转集合==========");
        //数组转集合
        String[] strs1 = {"aaa","ccc","bbb"};
        List<String> strings = Arrays.asList(strs1);
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("===========集合转数组==========");
        //集合转数组
        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
    }

}
