package org.mint.Java2024_12_21;

/**
 * @author 薄荷
 * @create 2024-12-21 13:20
 **/

public class OverloadMethod {
    public static void main(String[] args) {
        Num3 num3 = new Num3();
        num3.add(1.0, 2,3,4,5,6,7,8);
//        num3.add(1, 2, 3);
//        num3.add(1, 2.0);
    }
}

class Num3 {
//    void add(int n1, int n2) {
//        System.out.println(n1 + n2);
//    }
//
//    void add(int n1, int n2, int n3) {
//        System.out.println(n1 + n2 + n3);
//    }
//
//    void add(int n1, double n2) {
//        System.out.println(n1 + n2);
//    }

    void add(double d1,int ... nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        System.out.println(d1+ res);
    }
}
