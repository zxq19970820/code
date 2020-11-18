package homework___2__25.hw2;

import java.io.IOException;
import java.net.*;

public class udp__Client {

    public static void main(String[] args)  {
        try (DatagramSocket ds = new DatagramSocket(5421)) {

            String str = "helloword";

            byte[] b = str.getBytes();

            DatagramPacket dp = new DatagramPacket(b, str.length(),
                    InetAddress.getByName("127.0.0.1"), 1345);
            System.out.println("信息已发送");

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
