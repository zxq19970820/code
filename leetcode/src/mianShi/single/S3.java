package mianShi.single;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/1 16:57
 * 4
 */
public class S3 {
    private S3(){

    }
    private static S3 s3;
    public static S3 getS(){
        if (s3!=null){
            synchronized (S3.class){
                if (s3!=null){
                    s3=new S3();
                }
            }

        }
        return s3;
    }
}
