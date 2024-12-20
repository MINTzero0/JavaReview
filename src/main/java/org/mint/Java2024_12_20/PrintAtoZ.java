package org.mint.Java2024_12_20;

/**
 * @author 薄荷
 * @create 2024-12-20 18:33
 **/

public class PrintAtoZ {
    public static void main(String[] args) {
        // a-z Z-A
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c+" ");
        }
        System.out.println();
        for (char d = 'A'; d <= 'Z'; d++) {
            System.out.print(d+" ");
        }
        System.out.println();
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i+" ");
        }
    }
}
