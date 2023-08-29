package java_study.echo4;

import java.net.ServerSocket;
import java.net.Socket;

public class SeverExample {

	public static void main(String[] args) {

		try (ServerSocket serverSocket = new ServerSocket(10000);) {
			System.out.println("���� �⵿��");
			System.out.println("Ŭ���̾�Ʈ ���� ��� ��");

			while (true) {
				Socket socket = serverSocket.accept(); // ���Ӵ��
				System.out.println("Ŭ���̾�Ʈ ���� ����");

				// ���� ����� ������� ����
				Thread t = new WorkThread(socket);
				t.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
