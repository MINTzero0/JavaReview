package org.mint.Java2024_12_19;

import java.util.Scanner;

/**
 * @author 薄荷
 * @create 2024-12-19 15:36
 **/

public class SwitchSeason {
    public static void main(String[] args) {
        System.out.println("请输入1-12中的一个数");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
            case 2:
            case 3:
                System.out.println("春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬季");
                break;
            default:
                System.out.println("您输入的数字有误");
        }
    }
}
