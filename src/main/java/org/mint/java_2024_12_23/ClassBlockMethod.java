package org.mint.java_2024_12_23;

/**
 * @author 薄荷
 * @create 2024-12-23 12:49
 **/

public class ClassBlockMethod {
    public static void main(String[] args) {
        System.out.println(A.age);
        System.out.println(B.age);
        //静态代码块优先级大于静态变量
    }
}

class A {
    public static int age = 10;

    {
        System.out.println("A的代码块");
    }

    static {
        System.out.println("A的静态代码块");
    }

    public A() {
        System.out.println("A的构造器");
    }
}

class B extends A {

    public static int age = 20;

    {
        System.out.println("B的代码块");
    }

    static {
        System.out.println("B的静态代码块");
    }

    public B() {
        System.out.println("B的构造器");
    }

}
