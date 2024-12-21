package org.mint.Java2024_12_21;

/**
 * @author 薄荷
 * @create 2024-12-21 16:39
 **/

public class Inheriting1 {
    private String name;
    private int age;
    public void shut(){
        System.out.println("嘤嘤嘤");
    }

    public Inheriting1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
