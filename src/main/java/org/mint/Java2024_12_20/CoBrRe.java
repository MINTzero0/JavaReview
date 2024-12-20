package org.mint.Java2024_12_20;

/**
 * @author 薄荷
 * @create 2024-12-20 15:17
 **/

public class CoBrRe {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            if (i == 2){
                continue;
            }
            System.out.println("正在执行循环");
        }
        System.out.println("退出循环");

        System.out.println("-------------------------");

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            if (i == 2){
                break;
            }
            System.out.println("正在执行循环");
        }
        System.out.println("退出循环");

        System.out.println("-------------------------");

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            if (i == 2){
                return;
            }
            System.out.println("正在执行循环");
        }
        System.out.println("退出循环");
    }
}
