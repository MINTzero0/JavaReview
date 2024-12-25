package org.mint.java_2024_12_25;

import java.util.HashMap;

/**
 * @author 薄荷
 * @create 2024-12-25 12:17
 **/

public class MapUse {
    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(1,"小明");
        objectObjectHashMap.put(2,"小李");
        objectObjectHashMap.put(3,"小王");
        objectObjectHashMap.put(4,"小明");
        objectObjectHashMap.put(1,"小美");
        System.out.println(objectObjectHashMap);
    }
}
