package java_study.chapter15.sec01;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		File file = new File("C:/Temp/file.txt");

		try (FileWriter fw = new FileWriter(file, true);) {
			fw.write("FileWriter�� �ѱ۷ε� " + "\r\n");
			fw.write("���ڿ��� �ٷ� ����� �� �ִ� " + "\r\n");
			fw.flush();
			System.out.println("���Ͽ� ����Ǿ����ϴ�.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
