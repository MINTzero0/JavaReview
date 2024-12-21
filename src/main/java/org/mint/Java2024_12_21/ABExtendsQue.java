package org.mint.Java2024_12_21;

/**
 * @author 薄荷
 * @create 2024-12-21 17:18
 **/

public class ABExtendsQue {
    public static void main(String[] args) {
        B b = new B();
    }
}
class A{
    public A(){
        System.out.println("a");
    }
}

class B extends A{
    String name;
    public B(){
        this("b");
        System.out.println("B");
    }

    public B(String name){
        super();
        this.name = name;
        System.out.println(name);
    }
}
