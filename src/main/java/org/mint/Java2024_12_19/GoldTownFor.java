package org.mint.Java2024_12_19;

/**
 * @author 薄荷
 * @create 2024-12-19 16:20
 **/

public class GoldTownFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
