package org.mint.Java2024_12_19;

/**
 * @author 薄荷
 * @create 2024-12-19 9:30
 **/

public class ThreeOperator {
    public static void main(String[] args) {
        //?前面先判断，真为:前，假为:后
        int a = 10;
        int b = 20;
        int c = 30;
        int max = a > b ? a : b;
        int MAX = max > c ? max : c;
        int MaxMax = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println(MAX);
        System.out.println(MaxMax);
    }
}
