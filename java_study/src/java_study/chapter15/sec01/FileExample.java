package java_study.chapter15.sec01;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

// ���� Ȯ���ڰ� .txt���� ���� �Ǵ�
class TextFileFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		System.out.println("���͸�: " + name);
		return name.toLowerCase().endsWith(".txt");
	}

}

public class FileExample {

	public static void main(String[] args) throws URISyntaxException, IOException {
//		File dir = new File("C:/Temp/Dir");
//		File file1 = new File("C:/Temp/file1.txt");
//		File file2 = new File("C:/Temp/file2.txt");
//		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));

//		if (dir.exists() == false) 
//			System.out.println(dir + " �������� ����");
//			dir.mkdirs();
//		}
//		if (file1.exists() == false) {
//			System.out.println(file1 + " �������� ����");
//			file1.createNewFile();
//		}
//		if (file2.exists() == false) {
//			System.out.println(file2 + " �������� ����");
//			file2.createNewFile();
//		}
//		if (file3.exists() == false) {
//			System.out.println(file3 + " �������� ����");
//			file3.createNewFile();
//		}

		File temp = new File("C:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd aHH:mm");
		File[] contents = temp.listFiles(new TextFileFilter());
		System.out.println("��¥        �ð�        ����        ũ��        �̸�");
		System.out.println("-----------------------------------------------------------");

		for (File file : contents) {
			System.out.printf(sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.println("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
			}

			System.out.println();
		}

	}

}
