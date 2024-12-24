package org.mint.java_2024_12_24;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 薄荷
 * @create 2024-12-24 18:14
 **/

public class DateUse {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("当前时间"+date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String s = simpleDateFormat.format(date);
        System.out.println(s);
    }
}
