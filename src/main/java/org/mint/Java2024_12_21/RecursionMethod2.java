package org.mint.Java2024_12_21;

/**
 * @author 薄荷
 * @create 2024-12-21 12:44
 **/

public class RecursionMethod2 {
    //递归算法三要素
    //找到递归的公式：f(n) = f(n-1)*n
    //找到递归的终结点:f(1)
    //递归的方向必须走向终结点
    public static void main(String[] args) {
        Num2 num2 = new Num2();
        System.out.println(num2.method(5));
    }
}

class Num2{
    public int method(int n){
        if (n == 1){
            return 1;
        }else {
            return method(n-1)*n;
        }
    }
}
