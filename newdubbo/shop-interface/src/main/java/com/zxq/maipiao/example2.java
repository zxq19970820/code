package com.zxq.maipiao;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/31 11:21
 * 4
 */
public class example2 {

    public static void main(String[] args) {

        threadhhh tt=new threadhhh();

        for (int i = 0; i <10 ; i++) {
            new Thread(tt,"窗口"+i).start();
        }

    }


}
