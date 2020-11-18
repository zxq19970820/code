package NET;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udp_client {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(8888);
        System.out.println("开始发送");
        System.out.println("请输入要发送的内容");

//        String str="德玛西亚";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = br.readLine()) != null) {

            if (line.equals("over")) {
                break;
            }

            byte[] by = line.getBytes();

            DatagramPacket dp = new DatagramPacket(by, 0, by.length, InetAddress.getByName("127.0.0.1"), 14752);

            ds.send(dp);
            System.out.println("信息已发送");
        }

        System.out.println("--------分割线--------");
        System.out.println("发送端关闭");
//        ds.close();
    }
}
