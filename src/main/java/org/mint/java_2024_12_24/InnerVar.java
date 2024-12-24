package org.mint.java_2024_12_24;

/**
 * @author 薄荷
 * @create 2024-12-24 10:48
 **/

public class InnerVar {
    public static void main(String[] args) {
        //第一种方法
//        Outer02 outer02 = new Outer02();
//        Outer02.Inner02 inner02 = outer02.new Inner02();
//        inner02.method();
        //第二种方法
        Outer02.Inner02 inner02 = new Outer02().new Inner02();
        inner02.method();
    }
}

class Outer02 {
    class Inner02 {
        public void method() {
            System.out.println("内部类");
        }
    }
}
