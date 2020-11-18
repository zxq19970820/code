package homework___2__25.hw1.tcp_demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {


        Socket s = new Socket("127.0.0.1", 14159);

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("请输入要发送的内容");
            dos.writeUTF(sc.nextLine());
            System.out.println("消息已发送");
            System.out.println("服务器返回消息为" + dis.readUTF());

        }

    }
}
