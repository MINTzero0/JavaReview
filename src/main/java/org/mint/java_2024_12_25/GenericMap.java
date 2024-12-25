package org.mint.java_2024_12_25;

import java.util.HashMap;

/**
 * @author 薄荷
 * @create 2024-12-25 15:09
 **/

public class GenericMap {
    public static void main(String[] args) {
        HashMap<String, Student> HashMap = new HashMap<>();
        HashMap.put("123",new Student("小明",12));
        HashMap.put("345",new Student("小力",16));
        HashMap.put("111",new Student("小白",19));
        System.out.println(HashMap.keySet());//取key值
        System.out.println(HashMap);
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
