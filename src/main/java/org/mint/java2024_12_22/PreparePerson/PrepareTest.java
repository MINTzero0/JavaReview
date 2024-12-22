package org.mint.java2024_12_22.PreparePerson;

/**
 * @author 薄荷
 * @create 2024-12-22 23:03
 **/

public class PrepareTest {
    public static void main(String[] args) {
        PreparePerson doctor = new PreparePerson("小明",18,"IT",'男');
        PreparePerson doctor1 = new PreparePerson("小明",18,"IT",'男');
        PreparePerson doctor2 = new PreparePerson("小王",19,"IT",'男');
        boolean equals1 = doctor.equals(doctor1);
        boolean equals2 = doctor.equals(doctor2);
        System.out.println(equals1);
        System.out.println(equals2);
    }
}
