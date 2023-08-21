package practice._08_17_study;

import java.io.FileInputStream;

public class PracticeFileInputStream {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("C:/Practice/Dir/file1.txt")) {
			int data;
			while ((data = fis.read()) != -1) {
				// 1����Ʈ �� �����͸� �д´�. ���Ͽ� ��ȯ�� �� ���� �� -1�� ����Ѵ�.
				System.out.write(data);
			}
			System.out.flush();
			// flush�� ������� ������ Buffer�� ���� �ܷ� �����͸� �� �ҷ��� �� ����.
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
