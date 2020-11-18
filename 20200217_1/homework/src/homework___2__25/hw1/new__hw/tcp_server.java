package homework___2__25.hw1.new__hw;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class tcp_server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(15243);
        System.out.println("服务器已开启");
        Socket s = ss.accept();
        System.out.println("连接成功");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        while (true) {

            String str1 = br1.readLine();

            StringBuilder str4 = new StringBuilder();
            str4.append(str1);


            System.out.println("客户端发来消息为:" + str1);

            if (str1.equals("over")) {
                break;
            }

            System.out.println("请输入发给客户端的消息：");

//            String str2=br2.readLine();
//            bw.write(str2);

            String str3 = br2.readLine();

            bw.write(str3+ "\r\n");
            bw.flush();
            System.out.println("------------分割线------------");
        }
    }
}
