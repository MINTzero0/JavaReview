package org.mint.java_2024_12_26;

/**
 * @author 薄荷
 * @create 2024-12-26 16:50
 **/

public class GenericUse {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Animal{

}

class Dog extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("狗在叫");
    }
}
