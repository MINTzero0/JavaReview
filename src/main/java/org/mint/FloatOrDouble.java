package org.mint;

/**
 * @author 薄荷
 * @create 2024-12-18 18:29
 **/

public class FloatOrDouble {
    public static void main(String[] args) {
        double n1 = 3.1415926535;
        float n2 = 3.1415926535f;
        System.out.println(n1+"\n"+n2);

        double num1 = 2.7;
        double num2 = 8.1/3;
        System.out.println(num1 == num2);
        System.out.println(num1+"\n"+num2);
        if (Math.abs(num1-num2)<0.000001){
            System.out.println("他们两相等");
        }else {
            System.out.println("他们两不同");
        };

        float num3 = 2.7f;
    }
}
