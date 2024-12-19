package org.mint.Java2024_12_19;

/**
 * @author 薄荷
 * @create 2024-12-19 8:58
 **/

public class AutoAdd {
    public static void main(String[] args) {
        int i = 1;
        int k = 1;
        int j1;
        int j2;
        j1 = i++;//先赋值再自增
        j2 = ++k;//先自增再赋值
        System.out.println(j1+"\n"+i);
        System.out.println("-----------");
        System.out.println(j2+"\n"+i);

        int a = 1;
        a = a++;
        System.out.println(a);
        // a1 = 1 a 2 = a1 =1 a1 + 1 = 2 a1 = a2 =1
    }
}
