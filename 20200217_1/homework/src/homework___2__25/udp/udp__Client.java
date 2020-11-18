package homework___2__25.udp;

import java.io.IOException;
import java.net.*;

public class udp__Client {

    public static void main(String[] args)  {
        try (DatagramSocket ds = new DatagramSocket(5000)) {

            String str = "12345678987654321";
            byte[] b = str.getBytes();
            DatagramPacket dp = new DatagramPacket(b, str.length(),
                    InetAddress.getByName("127.0.0.1"), 1234);
            ds.send(dp);
            System.out.println("发送成功");
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
