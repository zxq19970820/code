package tcp_pricrtice;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("127.0.0.1", 10086);
        while (true) {
            OutputStream os = s.getOutputStream();

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            if (!str.equals("0")) {
                os.write(str.getBytes());
            } else break;

//        os.write("hello,tcpŒ“¿¥¡À".getBytes());


        }
        s.close();
    }
}