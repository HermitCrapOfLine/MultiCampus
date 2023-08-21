package practice._08_17_study;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class PracticeFileOutputStream {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("C:/Practice/Dir/file1.txt");
				Writer writer = new OutputStreamWriter(fos);) {

			String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
			writer.write(data);

			writer.flush();
			System.out.println("���� ������ �������ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
