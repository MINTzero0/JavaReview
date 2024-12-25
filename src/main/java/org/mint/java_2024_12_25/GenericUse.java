package org.mint.java_2024_12_25;

import java.util.ArrayList;

/**
 * @author 薄荷
 * @create 2024-12-25 13:40
 **/

public class GenericUse {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<>();
        arrayList.add(new Dog("旺财",10));
        arrayList.add(new Dog("小柴",20));
        arrayList.add(new Dog("阿喵",16));
        System.out.println(arrayList);
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
