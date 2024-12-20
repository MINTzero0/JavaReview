package org.mint.Java2024_12_20;

/**
 * @author 薄荷
 * @create 2024-12-20 19:21
 **/

public class ArrayReverse {
    public static void main(String[] args) {
        int arr [] = {11,22,33,44,55};
        for (int i = 0; i <= arr.length/2; i++) {
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
