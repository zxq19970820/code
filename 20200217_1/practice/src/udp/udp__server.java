package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class udp__server {
    public static void main(String[] args) {
        try {
            byte [] b=new byte[1024];
            DatagramSocket ds=new DatagramSocket(1234);
            DatagramPacket dp=new DatagramPacket(b,b.length);

            System.out.println("���������������ȴ���������");
            ds.receive(dp);
            String s=new String(dp.getData(),0,dp.getLength());
            System.out.println(s);

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
