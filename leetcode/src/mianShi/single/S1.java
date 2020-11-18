package mianShi.single;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/1 16:46
 * 4
 */
public class S1 {

    private S1(){

    }
    private static S1 s1;

    public static S1 getInstance(){
        return s1;
    }

}
