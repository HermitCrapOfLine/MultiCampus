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
		System.out.println("1���� 100���� ��" + sum);

		sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("1~100���� ¦�� ��" + sum);

		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ��� => ");
		int kb = sc.nextInt();

		sum = 0;
		for (int i = 2; i <= kb; i += 2) {
			sum += i;
		}
		System.out.printf("1 ~ %d���� ¦�� ��: %d \n", kb, sum);
	}

}
