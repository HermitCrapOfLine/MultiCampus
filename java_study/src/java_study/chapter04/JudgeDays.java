package java_study.chapter04;

import java.util.Scanner;

public class JudgeDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일 입력: 주중 1) 주말 2) 공휴일 3)");
		int data = sc.nextInt();
		if (data == 1) {
			System.out.println("열심히 공부합시다!!");
		} else if (data == 2) {
			System.out.println("열심히 놀아봅시다!!");
		} else {
			System.out.println("공휴일도 놀아야지!!");
		}

	}

}
