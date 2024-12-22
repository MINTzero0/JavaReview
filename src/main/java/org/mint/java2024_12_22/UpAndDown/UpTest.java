package org.mint.java2024_12_22.UpAndDown;

/**
 * @author 薄荷
 * @create 2024-12-22 14:27
 **/

public class UpTest {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        animal.run();
        //animal.climb();
        //向上转型

        System.out.println("-------------");

        Cat cat = new Cat();
        cat.run();
        cat.climb();
        cat.eat();

        System.out.println("------------");

        Cat cat1 = (Cat) animal;
        cat1.climb();
        //向下转型
    }
}
