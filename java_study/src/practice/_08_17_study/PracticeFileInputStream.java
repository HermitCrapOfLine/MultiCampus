package practice._08_17_study;

import java.io.FileInputStream;

public class PracticeFileInputStream {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("C:/Practice/Dir/file1.txt")) {
			int data;
			while ((data = fis.read()) != -1) {
				// 1바이트 씩 데이터를 읽는다. 파일에 반환할 게 없을 때 -1을 출력한다.
				System.out.write(data);
			}
			System.out.flush();
			// flush를 사용하지 않으면 Buffer에 남은 잔류 데이터를 다 불러올 수 없다.
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
