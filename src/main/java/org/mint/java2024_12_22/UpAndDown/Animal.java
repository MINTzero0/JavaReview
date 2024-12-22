package org.mint.java2024_12_22.UpAndDown;

/**
 * @author 薄荷
 * @create 2024-12-22 14:19
 **/

public class Animal {
    public void run(){
        System.out.println("爷会跑");
    }

    public void eat(){
        System.out.println("爷会吃");
    }
}

class Cat extends Animal{
    public void run(){
        System.out.println("猫会跑");
    }

    public void climb(){
        System.out.println("猫会爬");
    }
}

class Dog extends Animal{
    public void run(){
        System.out.println("狗会跑");
    }

    public void shut(){
        System.out.println("狗会叫");
    }
}
