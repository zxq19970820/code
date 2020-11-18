package mianShi;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/17 20:21
 * 4
 */
public class jiCheng {
    StringBuffer sb = new StringBuffer();
    StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        zi z = new zi();

        System.out.println(z == z);
    }
}

class fu {
    fu() {
        System.out.println("父类构造方法调用");
    }
}

class zi extends fu {
    zi() {
        System.out.println("子类构造方法调用");
    }
}