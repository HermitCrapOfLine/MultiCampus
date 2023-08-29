package java_study.chapter19.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHttpServer {

	public static void main(String[] args) {

		try (ServerSocket serverSocket = new ServerSocket(80);) {
			System.out.println("���� �⵿��");
			System.out.println("Ŭ���̾�Ʈ ���� ��� ��");

			while (true) {
				Socket socket = serverSocket.accept(); // ���Ӵ��
				System.out.println("Ŭ���̾�Ʈ ���� ����");

				BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				// 1. ��û ����
				String line = r.readLine();
				System.out.println(line);
				String[] url = line.split(" ");
				System.out.println("��û�� ����: " + url[1]);

				// 2. ��û ���(key:value)
				while (true) {
					line = r.readLine();
					if (line.equals("")) { // ����� ��
						break;
					}
					System.out.println(line);
				}

				// 3. BODY - GET ��û�϶��� ����

				// ������ ������
				PrintWriter w = new PrintWriter(socket.getOutputStream());
				// 1. ���� ����
				w.println("HTTP/1.1 200 OK");

				// 2. ���
				w.println("Content-type: text/html");
				w.println(); // ����� ��

				// 3. body �κ�
				w.println("<html>");
				w.println("<body><h1>Hi, Everyone</h1></body>");
				w.println("</html>");
				w.flush();
				socket.close();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
