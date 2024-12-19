package org.mint.Java2024_12_19;

/**
 * @author 薄荷
 * @create 2024-12-19 16:04
 **/

public class MulFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
