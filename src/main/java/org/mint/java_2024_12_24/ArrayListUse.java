package org.mint.java_2024_12_24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author 薄荷
 * @create 2024-12-24 18:57
 **/

public class ArrayListUse {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add(null);
        arrayList.add("3");
        System.out.println(arrayList.size());
        arrayList.remove(1);
        for (Object list : arrayList) {
            System.out.println(list);
        }
        System.out.println("----------------");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Cli");
        strings.add("Alice");
        strings.add("BoB");
        strings.add("David");
        Collections.sort(strings);
        for (String i : strings) {
            System.out.println(i);
        }
    }
}

//ArrayList 常用方法

//    add()	将元素插入到指定位置的 arraylist 中
//    addAll()	添加集合中的所有元素到 arraylist 中
//    clear()	删除 arraylist 中的所有元素
//    clone()	复制一份 arraylist
//    contains()	判断元素是否在 arraylist
//    get()	通过索引值获取 arraylist 中的元素
//    indexOf()	返回 arraylist 中元素的索引值
//    removeAll()	删除存在于指定集合中的 arraylist 里的所有元素
//    remove()	删除 arraylist 里的单个元素
//    size()	返回 arraylist 里元素数量
//    isEmpty()	判断 arraylist 是否为空
//    subList()	截取部分 arraylist 的元素
//    set()	替换 arraylist 中指定索引的元素
//    sort()	对 arraylist 元素进行排序
//    toArray()	将 arraylist 转换为数组
//    toString()	将 arraylist 转换为字符串
//    ensureCapacity()	设置指定容量大小的 arraylist
//    lastIndexOf()	返回指定元素在 arraylist 中最后一次出现的位置
//    retainAll()	保留 arraylist 中在指定集合中也存在的那些元素
//    containsAll()	查看 arraylist 是否包含指定集合中的所有元素
//    trimToSize()	将 arraylist 中的容量调整为数组中的元素个数
//    removeRange()	删除 arraylist 中指定索引之间存在的元素
//    replaceAll()	将给定的操作内容替换掉数组中每一个元素
//    removeIf()	删除所有满足特定条件的 arraylist 元素
//    forEach()	遍历 arraylist 中每一个元素并执行特定操作
