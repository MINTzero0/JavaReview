package org.mint.Java2024_12_21;

/**
 * @author 薄荷
 * @create 2024-12-21 14:04
 **/

public class ConstructUse {
    public static void main(String[] args) {
        Person2 person2 = new Person2("小明",19);
        Person2 person3 = new Person2("小王");
        System.out.println(person2.name+" "+person2.age);
        System.out.println(person3.name);
    }
}

class Person2{
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person2(String name) {
        this.name = name;
    }
}