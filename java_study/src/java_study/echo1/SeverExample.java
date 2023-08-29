package java_study.echo1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverExample {

	public static void main(String[] args) {

		Socket socket = null;

		try (ServerSocket serverSocket = new ServerSocket(10000);) {
			System.out.println("서버 기동됨");
			System.out.println("클라이언트 접속 대기 중");

			socket = serverSocket.accept(); // 접속대기

			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();

			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println("메세지 수신: " + new String(arr));

			String str = "Hello, Client";
			out.write(str.getBytes());
			out.flush();
			System.out.println("메세지 전송: " + str);

		} catch (Exception e) {

		}
	}

}
