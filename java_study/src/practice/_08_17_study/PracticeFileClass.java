package practice._08_17_study;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class PracticeFileClass {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// ���丮�� ������ ���� ��ü�� �����Ѵ�.
		File dir = new File("C:/Practice/Dir");
		File file1 = new File("C:/Practice/Dir/file1.txt");
		File file2 = new File("C:/Practice/Dir/file2.txt");
		File file3 = new File("C:/Practice/Dir/file3.txt");

		if (dir.exists() == false) { // ���丮�� ���� ���
			System.out.println(dir + " �������� �ʽ��ϴ�.");
			dir.mkdirs(); // ���丮�� ����
		}

		if (file1.exists() == false) { // ������ ���� ���
			System.out.println(dir + " �������� �ʽ��ϴ�.");
			file1.createNewFile(); // ������ ����
		}

		if (file2.exists() == false) { // ������ ���� ���
			System.out.println(dir + " �������� �ʽ��ϴ�.");
			file2.createNewFile(); // ������ ����
		}

		if (file3.exists() == false) { // ������ ���� ���
			System.out.println(dir + " �������� �ʽ��ϴ�.");
			file3.createNewFile(); // ������ ����
		}

	}

}
