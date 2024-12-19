package org.mint.Java2024_12_19;

import java.util.Scanner;

/**
 * @author 薄荷
 * @create 2024-12-19 15:19
 **/

public class EnhancementSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a-g");
        char c = scanner.next().charAt(0);

        switch (c){
            case 'a' -> System.out.println("星期一");
            case 'b' -> System.out.println("星期二");
            case 'c' -> System.out.println("星期三");
            case 'd' -> System.out.println("星期四");
            case 'e' -> System.out.println("星期五");
            default -> System.out.println("周末");
        }
        System.out.println("退出Switch");
    }
}
