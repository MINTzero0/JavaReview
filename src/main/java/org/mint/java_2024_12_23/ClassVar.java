package org.mint.java_2024_12_23;

/**
 * @author 薄荷
 * @create 2024-12-23 10:11
 **/

public class ClassVar {
    public static void main(String[] args) {
        Child child1 = new Child("小明");
        child1.join();
        Child child2 = new Child("小王");
        child2.join();
        System.out.println(Child.count);
        System.out.println(child1.count);
        System.out.println(child2.count);
    }
}

class Child{

    public String name;
    public static int count;//static初始化 类变量

    public Child(String name) {
        this.name = name;
    }

    public void join(){
        count++;
    }
}
