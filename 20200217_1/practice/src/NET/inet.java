package NET;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inet {
    public static void main(String[] args) throws UnknownHostException {

        //"192.168.2.114"

//        InetAddress address=InetAddress.getByName("诺基亚998");

        InetAddress address=InetAddress.getByName("192.168.2.114");
        System.out.println(address);


        String name=address.getHostName();
        System.out.println("主机名："+name);

        String ip=address.getHostAddress();
        System.out.println("ip地址："+ip);
    }
}
