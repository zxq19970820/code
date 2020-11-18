//package NET;
//
//import com.sun.security.ntlm.Server;
//
//import java.io.BufferedInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class service {
//    public static void main(String[] args) {
//
//        ServerSocket server = null;
//        try {
//            server = new ServerSocket(10086);
//            System.out.println("服务器已开启");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            Socket socket = server.accept();
//            System.out.println("客户端已连接");
//            BufferedInputStream isr = new BufferedInputStream(socket.getInputStream());
//            String str=isr.readUTF();
//            while (!str.equals("0")){
//                bos.writeUtf(str);
//            }
//
////            byte[] b = new byte[1024];
////            int len=0;
////            while ((len=isr.read(b))!=-1){
////                System.out.println(new String(b,0,len));
////            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//}
