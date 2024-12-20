package org.mint.Java2024_12_20;

/**
 * @author 薄荷
 * @create 2024-12-20 18:43
 **/

public class ArrNum {
    public static void main(String[] args) {
        String [] You = {"you","father","mother"};
        String [] Me = You;
        System.out.println(You[0]+" "+You[1]+" "+You[2]);
        System.out.println(Me[0]+" "+Me[1]+" "+Me[2]);
        System.out.println("-------------");
        Me[0] = "me";
        System.out.println(Me[0]+" "+Me[1]+" "+Me[2]);
    }
}
