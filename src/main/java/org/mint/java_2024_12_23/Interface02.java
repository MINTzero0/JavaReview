package org.mint.java_2024_12_23;

/**
 * @author 薄荷
 * @create 2024-12-23 16:48
 **/

public class Interface02 {
    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.i);
        System.out.println(D.i);
        System.out.println(E.i);
    }
}

interface D{
    int i = 10;//public static final int i = 10;
}

class E implements D{

}
