package org.mint.java_2024_12_24;

/**
 * @author 薄荷
 * @create 2024-12-24 10:59
 **/

public class EnumSeason {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.WINTER);
    }
}

enum Season2{
    SPRING("春","下雨"),SUMMER("夏","晴天"),AUTUMN("秋","夕阳"),WINTER("冬","下雪");
    private String name;
    private String use;

    Season2(String name, String use) {
        this.name = name;
        this.use = use;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", use='" + use + '\'' +
                '}';
    }
}
