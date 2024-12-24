package org.mint.java_2024_12_24;

/**
 * @author 薄荷
 * @create 2024-12-24 12:23
 **/

public class StringTest {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.str2 == (a.str1.intern()));//intern返回了常量
    }
}

class A{
    String str = "hsp";
    String str1 = new String("hsp");//new分配了新的地址值
    String str2 = "hsp";

}
