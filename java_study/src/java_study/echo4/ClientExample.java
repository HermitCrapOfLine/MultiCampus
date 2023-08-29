package java_study.echo4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {

	public static void main(String[] args) {
		try (Socket socket = new Socket("127.0.0.1", 10000)) {
			System.out.println("서버 연결 성공");

			BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			PrintWriter w = new PrintWriter(socket.getOutputStream());

			Scanner s = new Scanner(System.in);
			System.out.print("문자열 입력> ");
			String line = s.nextLine(); // 전송할 문자열 입력

			w.println(line);
			w.flush();

			String receiveLine = r.readLine();
			System.out.println("수신 메시지 : " + receiveLine);
			System.out.println("통신 종료");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
