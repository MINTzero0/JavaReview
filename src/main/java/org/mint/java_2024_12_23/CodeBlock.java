package org.mint.java_2024_12_23;

import javax.sound.midi.Soundbank;

/**
 * @author 薄荷
 * @create 2024-12-23 12:31
 **/

public class CodeBlock {
    public static void main(String[] args) {
        // AA aa = new AA();  static就分配了空间
        System.out.println(AA.age);
        System.out.println(BB.age);
    }
}

class AA{
    public static int age = 18; //static 创建的时候会分配空间
    static {
        System.out.println("AA的代码块，对象创建时就会执行");//代码块，对象创建自动执行
    }
}

class BB extends AA{
    public static int age = 20;
    static {
        System.out.println("BB的代码块");
    }
}
