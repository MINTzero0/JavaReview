package org.mint.Java2024_12_19;

/**
 * @author 薄荷
 * @create 2024-12-19 9:10
 **/

public class LogicOperator {
    public static void main(String[] args) {
        // & && | || ！^
        // &    两个条件都为真结果才为真
        // &&   两个条件都为真时结果为真
        // |    任意条件为真结果为真
        // ||   至少一个条件为真时结果为真
        // !    取反
        // ^    条件不同结果为真，相同为假
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;

        System.out.println(b1&b2);
        System.out.println(b1&&b2);
        System.out.println(b1&b3);
        System.out.println(b1&&b3);
        System.out.println(b1|b2);
        System.out.println(b1||b2);
        System.out.println(b1|b3);
        System.out.println(b1||b3);
        System.out.println(b1^b2);
        System.out.println(b1^b3);

        System.out.println("--------------");
        int i = 20;
        if (i<20 && i++>20){
            System.out.println("yeah");
        }else {
            System.out.println(i);
        }
    }
}
