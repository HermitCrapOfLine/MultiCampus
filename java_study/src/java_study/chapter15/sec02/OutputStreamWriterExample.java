package java_study.chapter15.sec02;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
				Writer writer = new OutputStreamWriter(fos);) {

			String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
			writer.write(data);
			// fos.write(data.getBytes());

			writer.flush();
			System.out.println("���� ������ �������ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
