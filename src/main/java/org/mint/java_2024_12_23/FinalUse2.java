package org.mint.java_2024_12_23;

import org.mint.java2024_12_22.PreparePerson.PreparePerson;

/**
 * @author 薄荷
 * @create 2024-12-23 16:23
 **/

public class FinalUse2 {
    public static void main(String[] args) {
        circle circle = new circle();
        System.out.println(circle.CulC(3));
        System.out.println(circle.CulS(3));
    }
}

class circle{
    private static final double PI = 3.14;
    private double R;

    public double CulS(double R){
        return R*R*PI;
    }
    public double CulC(double R){
        return 2*R*PI;
    }
}
