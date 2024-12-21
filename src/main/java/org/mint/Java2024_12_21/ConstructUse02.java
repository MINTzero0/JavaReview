package org.mint.Java2024_12_21;

/**
 * @author 薄荷
 * @create 2024-12-21 14:11
 **/

public class ConstructUse02 {
    public static void main(String[] args) {
        Dog dog = new Dog("小白",10);
        Dog dog1 = new Dog("大白",12);
        System.out.println(dog.compare(dog1));
    }
}

class Dog{
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compare(Dog dog){
      if (this.name.equals(dog.name)&&this.age == dog.age){
          return true;
      }else {
          return false;
      }
    }
}
