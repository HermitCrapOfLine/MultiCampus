package java_study.echo1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		try (Socket socket = new Socket("127.0.0.1", 10000)) {
			System.out.println("���� ���� ����");
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();

			String str = "Hello, Server";
			out.write(str.getBytes());
			out.flush();
			System.out.println("�޼��� ����: " + str);

			byte[] arr = new byte[100]; // ���� ����
			in.read(arr);
			System.out.print("�޽��� ����: ");
			System.out.println(new String(arr));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
