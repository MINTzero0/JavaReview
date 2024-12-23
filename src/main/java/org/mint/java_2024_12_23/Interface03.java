package org.mint.java_2024_12_23;

/**
 * @author 薄荷
 * @create 2024-12-23 16:54
 **/

public class Interface03 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        aaa.show();
    }
}

interface BBB{
    int i = 20;
}

class CCC{
    int i = 10;
}

class AAA extends CCC implements BBB{
    public void show(){
        System.out.println(BBB.i+"--"+super.i);
    }

}