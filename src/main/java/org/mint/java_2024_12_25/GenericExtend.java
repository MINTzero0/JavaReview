package org.mint.java_2024_12_25;

/**
 * @author 薄荷
 * @create 2024-12-25 16:24
 **/

public class GenericExtend {
    public static void main(String[] args) {
            Chicken<A> aChicken = new Chicken<A>(new A());
    }
}

class A{

}
class B extends A{

}

class Chicken<E>{
    E e;

    public Chicken(E e) {
        this.e = e;
    }
}
