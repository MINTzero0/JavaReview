package org.mint.Java2024_12_18;

/**
 * @author 薄荷
 * @create 2024-12-18 20:42
 **/

public class StringConvert {
    public static void main(String[] args) {
        //int double float char
        //这里是整型，浮点型转String
        int i = 10;
        double d = 10.0;
        float f = 10.0f;

        String s1 = i + "";
        String s2 = f + "";
        String s3 = d + "";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("----------------");

        //这里是String转整型，浮点型
        String S1 = "123";
        int i1 = Integer.parseInt(S1);
        double v = Double.parseDouble(S1);
        float v1 = Float.parseFloat(S1);
        System.out.println(i1);
        System.out.println(v);
        System.out.println(v1);
        System.out.println("----------------");
        //索引
        System.out.println(S1.charAt(0));
        System.out.println(S1.charAt(1));
        System.out.println(S1.charAt(2));
    }
}
