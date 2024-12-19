package org.mint.Java2024_12_19;

import java.util.Scanner;

/**
 * @author 薄荷
 * @create 2024-12-19 15:03
 **/

public class SwitchUse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a-g");
        char c = scanner.next().charAt(0);

        switch (c){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            default:
                System.out.println("周末");
                break;
        }
        System.out.println("退出Switch");
    }
}
