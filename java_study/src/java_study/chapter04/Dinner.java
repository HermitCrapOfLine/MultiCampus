package java_study.chapter04;

import java.util.Scanner;

public class Dinner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("저녁에 먹을 음식 종류 짜장면, 우동, 라면 >> ");
		String food = sc.next();

		switch (food) {
		case "짜장면":
			System.out.println("중국집으로 가요");
			break;
		case "우동":
			System.out.println("일식집으로 가요");
			break;
		case "라면":
			System.out.println("분식집으로 가요");
			break;
		default:
			System.out.println("집에서 먹어요!");
			break;
		}
	}

}
