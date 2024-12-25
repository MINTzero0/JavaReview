package org.mint.java_2024_12_25;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 薄荷
 * @create 2024-12-25 11:59
 **/

public class SetUse {
    public static void main(String[] args) {
        Set<Object> objects = new HashSet<>();
        objects.add(123);
        objects.add(456);
        objects.add("小明");
        objects.add("小明");
        objects.add("小刚");
        objects.add("小美");
        //打印对应的hash值
        for (Object obj : objects) {
            System.out.println(obj + " -> " + obj.hashCode());
        }
        System.out.println(objects);
    }
}
