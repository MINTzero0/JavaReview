package org.mint.java_2024_12_26;

/**
 * @author 薄荷
 * @create 2024-12-26 17:23
 **/

public class GenericUse01 {
    public static void main(String[] args) throws InterruptedException {
        Drinking drinking = new Drinking();
        Thread thread = new Thread(drinking);
        thread.start();
        int count = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("新兵喝" + (++count) + "碗汤");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i == 5) {
                System.out.println("司令先喝，我们等会喝");
                thread.join();//线程加入
                //Thread.yield 线程礼让
                System.out.println("司令喝完了，到我们了");
            }
        }
    }
}


class Drinking implements Runnable {
    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("司令官" + (++count) + "碗汤");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}