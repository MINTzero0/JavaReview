package org.mint.Java2024_12_21;

/**
 * @author 薄荷
 * @create 2024-12-21 11:41
 **/

public class RecursionMethod {
    //递归算法三要素
    //找到递归的公式：f(n) = f(n-1)*n
    //找到递归的终结点:f(1)
    //递归的方向必须走向终结点
    public static void main(String[] args) {
        Num num = new Num();
        num.method(4);
    }
}

class Num{
    void method(int n){
        if (n>2){
            method(n-1);
        }
        System.out.println("n="+n);
    }
}
