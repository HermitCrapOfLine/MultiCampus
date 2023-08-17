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
				// ���� �����Ϳ� ���ؼ��� ���

				System.out.println(cbuf); // cbuf �迭 100byte�� �� ���.
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
