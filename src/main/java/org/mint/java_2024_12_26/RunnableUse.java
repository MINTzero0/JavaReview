package org.mint.java_2024_12_26;

/**
 * @author 薄荷
 * @create 2024-12-26 17:00
 **/

public class RunnableUse {
    public static void main(String[] args) {
        Caty caty = new Caty();
        Bird bird = new Bird();
        Thread thread = new Thread(caty);
        Thread thread1 = new Thread(bird);
        thread.start();
        thread1.start();
    }
}

class Caty implements Runnable{

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("猫爬树"+" "+Thread.currentThread().getName()+(++count));
        }
    }
}

class Bird implements Runnable{
    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("鸟在飞" + " " + Thread.currentThread().getName() + (++count));
        }
    }
}
