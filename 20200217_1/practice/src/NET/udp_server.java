package NET;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udp_server {
    public static void main(String[] args) throws IOException {

        System.out.println("���ն�����");
        DatagramSocket ds = new DatagramSocket(14752);

        while (true) {
            byte[] by = new byte[1024];
            DatagramPacket dp = new DatagramPacket(by, by.length);

            ds.receive(dp);
            String ip = dp.getAddress().getHostAddress();         //ip��ַ
            int port = dp.getPort();                          //�˿ں�
            int num=dp.getLength();
            String data = new String(dp.getData(), 0, num);      //����


            System.out.println(ip);
            System.out.println(port);
            System.out.println(data);
//            System.out.println("--------�ָ���--------");
//            System.out.println("���ն˹ر�");
//        ds.close();
        }
    }
}
