package org.mint.java_2024_12_25;

import java.util.Vector;

/**
 * @author 薄荷
 * @create 2024-12-25 11:44
 **/

public class VectorsSource {
    public static void main(String[] args) {
        Vector<Object> objects = new Vector<>();
        for (int i = 0; i < 10; i++) {
            objects.add(i);
        }
        System.out.println(objects);
    }
}
