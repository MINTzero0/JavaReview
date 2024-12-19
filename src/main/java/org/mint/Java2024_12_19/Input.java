package org.mint.Java2024_12_19;

import java.util.Scanner;

/**
 * @author 薄荷
 * @create 2024-12-19 14:36
 **/

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        System.out.println("请输入工资");
        double wage = scanner.nextDouble();
        System.out.println("您的年龄"+ age);
        System.out.println("您的工资"+ wage);

    }
}
