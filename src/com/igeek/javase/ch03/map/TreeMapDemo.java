package com.igeek.javase.ch03.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap
 * 1.添加进来的元素会将key进行排序
 * 2.不允许key重复添加，一旦重复添加则发生覆盖
 * 3.要求添加的元素具备比较性，或集合容器自身具备比较性
 */
public class TreeMapDemo {

    public static void main(String[] args) {

        //匿名内部类
        TreeMap<IntegerDemo,String> map = new TreeMap<IntegerDemo,String>(new Comparator<IntegerDemo>() {
            @Override
            public int compare(IntegerDemo o1, IntegerDemo o2) {
                return o1.getI().compareTo(o2.getI());
            }
        });

        map.put(new IntegerDemo(333),"abc");
        map.put(new IntegerDemo(222),"abb");
        map.put(new IntegerDemo(111),"aba");

        Set<Map.Entry<IntegerDemo, String>> entries = map.entrySet();
        for (Map.Entry<IntegerDemo, String> entry : entries) {
            System.out.println("key = "+entry.getKey()+" , value = "+entry.getValue());
        }
    }

}
