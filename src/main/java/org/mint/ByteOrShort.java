package org.mint;

/**
 * @author 薄荷
 * @create 2024-12-18 18:27
 **/

public class ByteOrShort {
    public static void main(String[] args) {
        byte n1 = 3; //只在内存中开辟了1个字节的空间
        short n2 = 3; //在内存中开辟了2个字节的空间

        System.out.println(n1);
        System.out.println(n2);
    }
}
