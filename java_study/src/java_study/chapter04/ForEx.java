package java_study.chapter04;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 100까지 합" + sum);

		sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("1~100까지 짝수 합" + sum);

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요 => ");
		int kb = sc.nextInt();

		sum = 0;
		for (int i = 2; i <= kb; i += 2) {
			sum += i;
		}
		System.out.printf("1 ~ %d까지 짝수 합: %d \n", kb, sum);
	}

}
