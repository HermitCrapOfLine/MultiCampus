package java_study.echo4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class WorkThread extends Thread {
	Socket socket;

	public WorkThread(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter w = new PrintWriter(socket.getOutputStream());

			String line = r.readLine();
			System.out.println("서버 수신 메시지 : " + line);

			w.println(line);
			w.flush();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
