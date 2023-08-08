package java_study.chapter04;

public class MutilpleFor {

	public static void main(String[] args) {

		// 표를 처리하는 기본 골격
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
