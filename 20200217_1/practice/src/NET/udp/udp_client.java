package NET.udp;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.net.*;

public class udp_client {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds=new DatagramSocket();

        String str="��������";
        byte [] by=str.getBytes();

        DatagramPacket dp=new DatagramPacket(by,0,by.length, InetAddress.getByName("127.0.0.1"),14752);

        ds.send(dp);
        System.out.println("��Ϣ�ѷ���");

        System.out.println("--------�ָ���--------");
        System.out.println("���Ͷ˹ر�");
        ds.close();
    }
}
