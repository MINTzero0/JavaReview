package org.mint.Java2024_12_20;

/**
 * @author 薄荷
 * @create 2024-12-20 15:28
 **/

public class WaterNum {
    public static void main(String[] args) {
        // 遍历所有三位数
        for (int i = 100; i < 1000; i++) {
            // 分解各个位数
            int hundreds = i / 100;        // 百位
            int tens = (i % 100) / 10;     // 十位
            int ones = i % 10;             // 个位

            // 判断是否是水仙花数
            if (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(ones, 3) == i) {
                System.out.println(i + " 是水仙花数");
            }
        }
    }
}
