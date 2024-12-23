package org.mint.java_2024_12_23;

/**
 * @author 薄荷
 * @create 2024-12-23 18:55
 **/

public class AnoInnerClass {
    public static void main(String[] args) {
        DD dd = new DD();
        dd.method();
    }
}

interface EE{
    void method();
}

class DD{
    public void method(){
        EE ee = new EE() {
            //编译类型是EE
            //运行类型是DD$1

            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        };

        ee.method();
        System.out.println(ee.getClass());//DD$1
    }
}
