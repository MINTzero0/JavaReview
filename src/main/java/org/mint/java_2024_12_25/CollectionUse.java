package org.mint.java_2024_12_25;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 薄荷
 * @create 2024-12-25 12:33
 **/

public class CollectionUse {
    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        objects.add(7);
        objects.add(5);
        objects.add(3);
        objects.add(9);
        objects.add(0);
        objects.add(0);
//        Collections.reverse(objects);//倒着输出
//        Collections.sort(objects);//排序输出
//        Collections.swap(objects,0,3);//指定对应下标的值交换位置
//        Collections.shuffle(objects);//随机顺序打印
        System.out.println(Collections.max(objects));//打印最大值
        System.out.println(Collections.min(objects));//打印最小值
        Collections.replaceAll(objects,0,8);//替换所有对应的值
        System.out.println(objects);
    }
}
