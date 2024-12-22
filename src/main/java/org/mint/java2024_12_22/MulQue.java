package org.mint.java2024_12_22;

/**
 * @author 薄荷
 * @create 2024-12-22 15:06
 **/

public class MulQue {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.count);
        b.method();

        System.out.println("-----------");

        A a = b;
        System.out.println(a==b);
        System.out.println(a.count); //看左边：编译器只看变量的声明类型（也就是A a中的A）
        a.method(); //看右边：程序运行时，会检查变量a实际指向的对象类型。

    }
}

class A {
    int count = 10;
    public void method(){
        System.out.println(this.count);
    }
}

class B extends A {
    int count = 20;
    public void method(){
        System.out.println(this.count);
    }
}