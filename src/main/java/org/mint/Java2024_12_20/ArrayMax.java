package org.mint.Java2024_12_20;

/**
 * @author 薄荷
 * @create 2024-12-20 18:37
 **/

public class ArrayMax {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int Max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (Max<arr[i]){
                Max = arr[i];
            }
        }
        System.out.println("该数组最大的数为"+Max);
    }
}
