package homework___2__25.hw2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(11111);

		Socket s = ss.accept();
		
		String ip = s.getInetAddress().getHostAddress();

		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(ip+":"+text);

		OutputStream out = s.getOutputStream();
		out.write("收到".getBytes());
		
		s.close();
		ss.close();
		
	}

}
