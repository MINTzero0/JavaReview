package org.mint.java_2024_12_23;

/**
 * @author 薄荷
 * @create 2024-12-23 16:31
 **/

public class Interface01 {
    public static void main(String[] args) {
    }
}

interface Animals{
    int i=10;
    void run();
}

interface Cat{
    void cli();
}

interface Dog extends Cat,Animals{
    void shut();

}

abstract class Bird2 implements Dog{

}

class Bird implements Animals,Cat{
    @Override
    public void run(){
        System.out.println("鸟会飞");
    }

    @Override
    public void cli(){
        System.out.println("猫会爬");
    }
}