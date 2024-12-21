package org.mint.Java2024_12_20;

import java.util.Arrays;

/**
 * @author 薄荷
 * @create 2024-12-20 19:35
 **/

public class PopSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 36, 78, 79, 76, 999, 890, 8, 3};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr) {
        for (int j=0;j< arr.length-1;j++){
            for (int i=0;i< arr.length-1-j;i++){
                if(arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
