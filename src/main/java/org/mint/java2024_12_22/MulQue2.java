package org.mint.java2024_12_22;

/**
 * @author 薄荷
 * @create 2024-12-22 17:02
 **/

public class MulQue2 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb.i);
        System.out.println(bb.sum2());
        System.out.println("------------");
        AA aa = bb;
        System.out.println(aa.i);
        System.out.println(aa.sum2());
    }
}

class AA {
    int i = 10;

    int sum() {
        return i + 30;
    }

    int sum2() {
        return getI() + 20;
    }

    int getI() {
        return i;
    }
}

class BB extends AA {
    int i = 20;

    int sum() {
        return i + 30;
    }

    int sum2() {
        return getI() + 40;
    }

    int getI() {
        return i;
    }
}
