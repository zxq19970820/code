package homework___2__25.hw1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server__test {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(54321);
        System.out.println("服务器启动");

        while (true) {
            Socket socket = server.accept();

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintStream ps = new PrintStream(socket.getOutputStream());

                String line = br.readLine();

                line = (new StringBuilder(line)).reverse().toString();
                ps.println(line);
                socket.close();

            } catch (IOException var4) {
                var4.printStackTrace();
            }

        }
    }
}
