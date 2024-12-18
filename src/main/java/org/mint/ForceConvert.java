package org.mint;

/**
 * @author 薄荷
 * @create 2024-12-18 20:39
 **/

public class ForceConvert {
    public static void main(String[] args) {
        //精度排序由低到高
        //char int long float double
        //byte char int long float double
        //强转会有精度损耗
        int i = (int) 1.9;
        byte b = (byte) 2000;
        System.out.println(i);//小数点后丢失
        System.out.println(b);//越界
    }
}
