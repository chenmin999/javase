package com.igeek.javase.ch03.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map <key,value>
 * 1.key的原理跟Set原理一致
 * 2.不允许重复插入
 * 3.不保留原始存入顺序
 * 4.put方法存储元素
 * 5.当插入重复元素时，会产生覆盖
 */
public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<String,Integer>();

        //put方法，添加键值对
        map.put("abc",111);
        map.put("abf",222);
        map.put("abd",333);
        map.put("abc",444);

        //Set<Map.Entry<K,V>> entrySet()
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("键："+entry.getKey()+",值："+entry.getValue());
        }

        System.out.println("============================");
        // Set<K> keySet()
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println("key = "+key+",value="+map.get(key));
        }

        System.out.println("============================");
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println("value = "+value);
        }
    }

}
