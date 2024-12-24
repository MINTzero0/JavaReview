package org.mint.java_2024_12_24;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author 薄荷
 * @create 2024-12-24 13:04
 **/

public class BigIntegerUse {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("1111111111111111111");
        BigInteger bigInteger2 = new BigInteger("222211111111111111111");
        BigDecimal bigDecimal1 = new BigDecimal("1111.1111111");
        BigDecimal bigDecimal2 = new BigDecimal("112222211.1111111");
        System.out.println(bigDecimal2.add(bigDecimal1));
        System.out.println(bigDecimal2.divide(bigDecimal1,BigDecimal.ROUND_CEILING));
    }
}
