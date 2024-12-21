package org.mint.Java2024_12_21;

/**
 * @author 薄荷
 * @create 2024-12-21 11:16
 **/

public class Object01 {
    public static void main(String[] args) {
        Person Tom = new Person();
        Tom.name = "TOM";
        Tom.age = 24;
        Person Jerry = new Person();
        Jerry.name = "Jerry";
        Jerry.age = 24;
        Person person = new Person();
        person = Tom;
        System.out.println(person.name + " " + person.age);
        System.out.println("--------------------");
        person.name = "cookie";
        System.out.println(person.name);
    }
}

class Person{
    String name;
    int age;
}
