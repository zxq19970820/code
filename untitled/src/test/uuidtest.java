package test;

import java.util.UUID;

public class uuidtest {

    public static void main(String[] args) {
        String str = UUID.randomUUID().toString();
        System.out.println("处理前"+str);

        str = String.join("", str.split("-"));
        System.out.println("处理后"+str);
    }
}
