package homework___2__25.hw2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo2 {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("192.168.1.100",11111);

		OutputStream out = socket.getOutputStream();	

		out.write("tcp".getBytes());

		InputStream in = socket.getInputStream();
		byte[] buf = new byte[1024];

		int len = in.read(buf);

		String  text = new String(buf,0,len);
		System.out.println(text);

		socket.close();
	}

}
