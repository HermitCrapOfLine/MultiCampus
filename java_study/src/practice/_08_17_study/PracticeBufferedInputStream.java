package practice._08_17_study;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class PracticeBufferedInputStream {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;

		// 성능 향상 보조 스트림을 사용하지 않았을 때 걸리는 시간
		try (FileInputStream fis1 = new FileInputStream("C:/practice/dir/forest.jpg");) {
			start = System.currentTimeMillis();
			while (fis1.read() != -1) {
			}
			end = System.currentTimeMillis();
			System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 성능 향상 보조 스트림을 사용했을 때 걸리는 시간
		try (FileInputStream fis1 = new FileInputStream("C:/practice/dir/forest.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis1)) {

			start = System.currentTimeMillis();
			while (bis.read() != -1) {
			}
			end = System.currentTimeMillis();
			System.out.println("사용하지 했을 때: " + (end - start) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
