package org.mint.Java2024_12_18;

/**
 * @author 薄荷
 * @create 2024-12-18 20:30
 **/

public class AutoConvert {
    public static void main(String[] args) {
        //自动类型转换由低到高排序，只能低转高，精度排序由低到高
        //char int long float double
        //byte char int long float double
        double d = 100;
        int i0 = 'a';
        System.out.println(d);
        System.out.println(i0);
        System.out.println("-----------------");

        int i1= 100;
        float f = 10.1f;
        //取最大精度
        System.out.println(d+i1+f);//浮点型有差错很正常，没有实现高精度，受二进制限制
    }
}
