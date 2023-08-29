package java_study.echo1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		try (Socket socket = new Socket("127.0.0.1", 10000)) {
			System.out.println("서버 연결 성공");
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();

			String str = "Hello, Server";
			out.write(str.getBytes());
			out.flush();
			System.out.println("메세지 전송: " + str);

			byte[] arr = new byte[100]; // 수신 버퍼
			in.read(arr);
			System.out.print("메시지 수신: ");
			System.out.println(new String(arr));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
