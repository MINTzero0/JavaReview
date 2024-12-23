package org.mint.java_2024_12_23;

/**
 * @author 薄荷
 * @create 2024-12-23 17:02
 **/

public class OutInputClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.OOmethod();
    }
}

class Outer{
    private int i = 10;
    public void OOmethod(){
        class inner{
            int ii = 20;
            public void IImethod(){
                System.out.println("这是内部类"+ii);
                System.out.println("这是外部类"+i);
            }
        }
        inner inner = new inner();
        inner.IImethod();
    }
}
