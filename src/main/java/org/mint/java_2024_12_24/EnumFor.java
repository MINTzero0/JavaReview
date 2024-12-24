package org.mint.java_2024_12_24;

/**
 * @author 薄荷
 * @create 2024-12-24 11:47
 **/

public class EnumFor {
    public static void main(String[] args) {
        Week [] weeks = Week.values();
        for (Week week : weeks){
            System.out.println(week);
        }
    }
}

enum Week{
    MONDAY("周一"),TUESDAY("周二"),WEDNESDAY("周三"),THURSDAY("周四"),FRIDAY("周五") ;
    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
