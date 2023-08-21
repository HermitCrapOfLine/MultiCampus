package practice._08_17_study;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class PracticeBufferedInputStream {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;

		// ���� ��� ���� ��Ʈ���� ������� �ʾ��� �� �ɸ��� �ð�
		try (FileInputStream fis1 = new FileInputStream("C:/practice/dir/forest.jpg");) {
			start = System.currentTimeMillis();
			while (fis1.read() != -1) {
			}
			end = System.currentTimeMillis();
			System.out.println("������� �ʾ��� ��: " + (end - start) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ���� ��� ���� ��Ʈ���� ������� �� �ɸ��� �ð�
		try (FileInputStream fis1 = new FileInputStream("C:/practice/dir/forest.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis1)) {

			start = System.currentTimeMillis();
			while (bis.read() != -1) {
			}
			end = System.currentTimeMillis();
			System.out.println("������� ���� ��: " + (end - start) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
