package org.mint.java_2024_12_23;

import org.mint.java2024_12_22.PreparePerson.PreparePerson;

import java.util.SplittableRandom;

/**
 * @author 薄荷
 * @create 2024-12-23 13:48
 **/

public class FinalUse {
    public static void main(String[] args) {
        System.out.println(C.num4);
    }
}

class C {
    private final int num1 = 0;//final修饰符后面修饰的变量必须要赋初始值
    private final int num2;
    private final int num3;
    public static final int num4;

    public C() {
        num2 = 2;
    }

    {
        num3 = 3;
    }

    static {
        num4 = 4;
        System.out.println("C的静态代码块");
    }

    public final void C2() {
        //final修饰符所修饰的类和方法均无法重写
    }

}

class CC extends C {
    //public void C2(){}
    //final修饰符所修饰的类和方法均无法重写
}
