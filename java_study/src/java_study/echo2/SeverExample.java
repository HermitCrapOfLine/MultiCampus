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
			System.out.println("서버 기동됨");
			System.out.println("클라이언트 접속 대기 중");

			socket = serverSocket.accept(); // 접속대기
			System.out.println("클라이언트 접속 성공");

			BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			PrintWriter w = new PrintWriter(socket.getOutputStream());

			String line = r.readLine();
			System.out.println("서버 수신 메시지 : " + line);

			w.println(line);
			w.flush();
		} catch (Exception e) {

		}
	}

}
