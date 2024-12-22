package org.mint.java2024_12_22.PreparePerson;

/**
 * @author 薄荷
 * @create 2024-12-22 22:54
 **/

public class PreparePerson {
    private String name;
    private int age;
    private String job;
    private char sex;

    public PreparePerson(String name, int age, String job, char sex) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.sex = sex;
    }

    public boolean equals(Object obj) {
        //比较地址(如果地址都一样，啥都不用比较了)
        if (this == obj) {
            return true;
        }
        //比较名字等等
        if (obj instanceof PreparePerson) {
            PreparePerson preparePerson = (PreparePerson) obj;
            if (this.name.equals(preparePerson.name) && this.age == preparePerson.age && this.sex == preparePerson.sex && this.job == preparePerson.job) {
                return true;
            }
        }
        return false;
    }
}
