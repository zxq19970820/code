package NET;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest {
    public static void main(String[] args) {
        try {
            Socket socket =new Socket("127.0.0.1",10086);
           DataInputStream bos=new DataInputStream(socket.getInputStream());
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();


            while (!str.equals("0")){

            }
//            bos.writeUTF("服务器你好，我是客户端");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
