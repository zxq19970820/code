package homework___2__25.hw1.tcp_demo;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss=new ServerSocket(14159);
        System.out.println("服务器已启动");
        Socket s=ss.accept();
        System.out.println("连接成功");

        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());

        while (true){
            String s1 = dis.readUTF();
            System.out.println("客户端发来的消息为"+s1);

            StringBuilder sb=new StringBuilder(s1);
            String str= String.valueOf(sb.reverse());

            System.out.println("分割线");

            dos.writeUTF(str);
            System.out.println(str);
        }

    }
}
