package java_study.echo2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverExample {

	public static void main(String[] args) {

		Socket socket = null;

		try (ServerSocket serverSocket = new ServerSocket(10000);) {
			System.out.println("���� �⵿��");
			System.out.println("Ŭ���̾�Ʈ ���� ��� ��");

			socket = serverSocket.accept(); // ���Ӵ��
			System.out.println("Ŭ���̾�Ʈ ���� ����");

			BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			PrintWriter w = new PrintWriter(socket.getOutputStream());

			String line = r.readLine();
			System.out.println("���� ���� �޽��� : " + line);

			w.println(line);
			w.flush();
		} catch (Exception e) {

		}
	}

}
