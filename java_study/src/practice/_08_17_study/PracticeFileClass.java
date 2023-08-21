package practice._08_17_study;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class PracticeFileClass {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// 디렉토리와 파일을 만들 객체를 생성한다.
		File dir = new File("C:/Practice/Dir");
		File file1 = new File("C:/Practice/Dir/file1.txt");
		File file2 = new File("C:/Practice/Dir/file2.txt");
		File file3 = new File("C:/Practice/Dir/file3.txt");

		if (dir.exists() == false) { // 디렉토리가 없을 경우
			System.out.println(dir + " 존재하지 않습니다.");
			dir.mkdirs(); // 디렉토리를 생성
		}

		if (file1.exists() == false) { // 파일이 없을 경우
			System.out.println(dir + " 존재하지 않습니다.");
			file1.createNewFile(); // 파일을 생성
		}

		if (file2.exists() == false) { // 파일이 없을 경우
			System.out.println(dir + " 존재하지 않습니다.");
			file2.createNewFile(); // 파일을 생성
		}

		if (file3.exists() == false) { // 파일이 없을 경우
			System.out.println(dir + " 존재하지 않습니다.");
			file3.createNewFile(); // 파일을 생성
		}

	}

}
