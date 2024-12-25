package org.mint.java_2024_12_25;

/**
 * @author 薄荷
 * @create 2024-12-25 14:35
 **/

public class GenericUseClass {
    public static void main(String[] args) {
        Person<String> StringPerson = new Person<String>("1");
        StringPerson.getClass01();
        System.out.println(StringPerson);
    }
}

class Person<E> {
    E e;

    private E method(E e) {
        return e;
    }

    public void getClass01(){
        System.out.println(e.getClass());
    }

    public Person(E e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Person{" +
                "e=" + e +
                '}';
    }
}
