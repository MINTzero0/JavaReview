package org.mint.Java2024_12_20;

/**
 * @author 薄荷
 * @create 2024-12-20 19:17
 **/

public class ArrayCopy {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2 [i] = arr1 [i];
            System.out.print(arr2[i]+" ");
        }
    }
}
