package org.mint.Java2024_12_19;

/**
 * @author 薄荷
 * @create 2024-12-19 15:55
 **/

public class ForUse {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i="+i);
        }
        System.out.println("-----------------");
        int a = 0;
        for (; a < 10; a++) {
            System.out.println("a="+a);
        }
        System.out.println("-----------------");
        int b = 0;
        for (;;b++) {
            System.out.println("b="+b);
            if (b>=10){
                break;
            }
        }
        System.out.println("-----------------");
        int c = 100;
        int d = 0;
        for (int i = 0; i <= c; i++) {
            if (i%9 == 0){
                System.out.println("9的倍数为"+i);
                d += i;
                System.out.println("这些倍数相加为"+d);
            }
        }
    }
}
