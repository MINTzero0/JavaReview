package org.mint.java_2024_12_26;

/**
 * @author 薄荷
 * @create 2024-12-26 10:47
 **/

public class ThreadUse {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+"在执行"+i);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Cat extends Thread{
    public void run(){
        int temp = 0;
        while (true){
            try {
                sleep(1000);
                System.out.println("我是猫");
                System.out.println(Thread.currentThread().getName()+"在执行"+temp);
                temp++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (temp == 6){
                break;
            }
        }
    }
}
