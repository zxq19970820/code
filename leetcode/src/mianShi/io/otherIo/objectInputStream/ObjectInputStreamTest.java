package mianShi.io.otherIo.objectInputStream;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 20:12
 * 4
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        User p = new User();
        p.setId(1);
        p.setName("zxq");

        FileOutputStream out=new FileOutputStream("bbb.txt");
        try {
            ObjectOutputStream oos=new ObjectOutputStream(out);
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}



