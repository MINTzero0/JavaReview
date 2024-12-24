package org.mint.java_2024_12_24;

/**
 * @author 薄荷
 * @create 2024-12-24 12:31
 **/

public class System01 {
    public static void main(String[] args) {
        Long StartTime = System.currentTimeMillis();//从1970-2024的毫秒数
        for (int i = 1; i < 1000000000; i++) {
            i *=i;
        }
        Long EndTime = System.currentTimeMillis();
        Long Time = (EndTime-StartTime);
        System.out.println("For循环执行的时间"+Time);
        //cpu太好了，导致计算时间太短了
    }
}
