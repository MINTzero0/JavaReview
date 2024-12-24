package org.mint.java_2024_12_24;

/**
 * @author 薄荷
 * @create 2024-12-24 10:56
 **/

public class StaticInnerClass {
    public static void main(String[] args) {
        AAA.BBB bbb = new AAA.BBB();
        bbb.method();
    }
}

class AAA{
    static int i =10;
    static class BBB{
        public void method(){
            System.out.println("BBB");
            System.out.println(i);
        }
    }
}
