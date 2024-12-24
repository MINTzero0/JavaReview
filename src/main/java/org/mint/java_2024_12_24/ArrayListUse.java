package org.mint.java_2024_12_24;

import java.util.ArrayList;

/**
 * @author 薄荷
 * @create 2024-12-24 18:57
 **/

public class ArrayListUse {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add(null);
        arrayList.add("3");
        for (Object list: arrayList ){
            System.out.println(list);
        }
    }
}
