package java_study.chapter15.sec01;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) {

		try (FileReader fr = new FileReader("C:/temp/test.txt");) {
			int readCharNo;
			char[] cbuf = new char[100];
			while ((readCharNo = fr.read(cbuf)) != -1) {
				String data = new String(cbuf, 0, readCharNo);
				System.out.println(data);
				// 읽은 데이터에 대해서만 출력

				System.out.println(cbuf); // cbuf 배열 100byte를 다 출력.
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
