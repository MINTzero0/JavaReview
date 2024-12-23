package org.mint.java_2024_12_23;

/**
 * @author 薄荷
 * @create 2024-12-23 12:08
 **/

public class ClassMethod {
    public static void main(String[] args) {
        Person2 person2 = new Person2("小明");
        person2.payfee(200);
        person2.Count();
        Person2 person3 = new Person2("小王");
        person3.payfee(300);
        person3.Count();
    }
}

class Person2{
    private String name;
    private static double fee;
    private static double count;

    public Person2(String name) {
        this.name = name;
    }

    public void payfee(double fee){
        count+=fee;
    }

    public static void Count(){  //静态方法只能调用静态变量
        System.out.println(count);
    }
}
