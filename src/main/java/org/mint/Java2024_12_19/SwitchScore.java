package org.mint.Java2024_12_19;

import java.util.Scanner;

/**
 * @author 薄荷
 * @create 2024-12-19 15:26
 **/

public class SwitchScore {
    public static void main(String[] args) {
        System.out.println("请输入您的成绩");
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
        if (v>=0&&v<=100) {
            switch ((int) v / 60) {
                case 0:
                    System.out.println("您的成绩不合格");
                    break;
                case 1:
                    System.out.println("您的成绩合格");
                    break;
            }
        } else {
            System.out.println("输入的成绩有误");
        }
    }
}
