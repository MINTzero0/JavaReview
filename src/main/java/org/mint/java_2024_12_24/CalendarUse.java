package org.mint.java_2024_12_24;

import java.util.Calendar;

/**
 * @author 薄荷
 * @create 2024-12-24 18:31
 **/

public class CalendarUse {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//Calendar属于抽象方法，无法创建实例
        // 获取当前时间的各种字段
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // 月份是从 0 开始，需要加 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24 小时制
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("当前时间：" + year + "年" + month + "月" + day + "日 " + hour + "时" + minute + "分" + second + "秒");
    }
}