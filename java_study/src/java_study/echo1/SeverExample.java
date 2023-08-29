package java_study.echo1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverExample {

	public static void main(String[] args) {

		Socket socket = null;

		try (ServerSocket serverSocket = new ServerSocket(10000);) {
			System.out.println("���� �⵿��");
			System.out.println("Ŭ���̾�Ʈ ���� ��� ��");

			socket = serverSocket.accept(); // ���Ӵ��

			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();

			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println("�޼��� ����: " + new String(arr));

			String str = "Hello, Client";
			out.write(str.getBytes());
			out.flush();
			System.out.println("�޼��� ����: " + str);

		} catch (Exception e) {

		}
	}

}
