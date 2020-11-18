package homework___2__25.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class client_test {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");

        Socket socket = new Socket("127.0.0.1", 54321);

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintStream ps = new PrintStream(socket.getOutputStream());

        ps.println(sc.nextLine());

        System.out.println("翻转结果为："+br.readLine());

        socket.close();
    }
}

