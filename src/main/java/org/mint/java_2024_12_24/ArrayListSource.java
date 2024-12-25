package org.mint.java_2024_12_24;

import java.util.ArrayList;

/**
 * @author 薄荷
 * @create 2024-12-24 19:05
 **/

public class ArrayListSource {
    public static void main(String[] args) {
        //默认大小是10，容量不足按照1.5倍扩容
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i <= 10 ; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
    }
}
