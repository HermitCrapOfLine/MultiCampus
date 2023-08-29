package java_study.echo4;

import java.net.ServerSocket;
import java.net.Socket;

public class SeverExample {

	public static void main(String[] args) {

		try (ServerSocket serverSocket = new ServerSocket(10000);) {
			System.out.println("서버 기동됨");
			System.out.println("클라이언트 접속 대기 중");

			while (true) {
				Socket socket = serverSocket.accept(); // 접속대기
				System.out.println("클라이언트 접속 성공");

				// 실제 통신은 스레드로 위임
				Thread t = new WorkThread(socket);
				t.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
