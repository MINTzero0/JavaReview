package org.mint.Java2024_12_21;

/**
 * @author 薄荷
 * @create 2024-12-21 11:23
 **/

public class ObjectMethod {
    public static void main(String[] args) {
        Person02 person02 = new Person02();
        person02.name = "Jerry";
        person02.age = 24;
        person02.method(person02);
        System.out.println(person02.name+" "+ person02.age);
    }
}

class Person02{
    String name;
    int age;
    void method(Person02 p){
       p.name = "Tom";
       p.age = 24;
    }
}
