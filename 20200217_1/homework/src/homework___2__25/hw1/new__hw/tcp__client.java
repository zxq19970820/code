package homework___2__25.hw1.new__hw;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class tcp__client {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket(InetAddress.getLocalHost(), 15243);

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        System.out.println("请输入客户端要发送的内容");
        while (true) {

            String str = br1.readLine();
            bw.write(str + "\r\n");

            bw.flush();

//            if (str.equals("over")) {
//                break;
//            }

            System.out.println("服务器发来消息：" + br2.readLine());
        }

    }
}
