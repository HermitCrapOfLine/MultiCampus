package java_study.chapter15.sec01;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("C:/temp/test.txt")) {
			int data;
			while ((data = fis.read()) != -1) {
				System.out.write(data);
//				System.out.print((char) data);
			}
			System.out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
