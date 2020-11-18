package tcp_pricrtice;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

public class serverTest {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器已开启");

        Socket s = ss.accept();
        System.out.println("服务器已连接");

        InputStream is = s.getInputStream();
        byte[] by = new byte[1024];
        int len = 0;
        while ((len = is.read(by)) != -1) {
            String data =new String(by,0,len);
            System.out.println("数据是："+data);

        }
        s.close();
        ss.close();

    }

}
