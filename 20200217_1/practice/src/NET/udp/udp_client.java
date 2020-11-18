package NET.udp;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.net.*;

public class udp_client {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds=new DatagramSocket();

        String str="德玛西亚";
        byte [] by=str.getBytes();

        DatagramPacket dp=new DatagramPacket(by,0,by.length, InetAddress.getByName("127.0.0.1"),14752);

        ds.send(dp);
        System.out.println("信息已发送");

        System.out.println("--------分割线--------");
        System.out.println("发送端关闭");
        ds.close();
    }
}
