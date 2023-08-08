package java_study.chapter04;

import java.util.Scanner; // ctrl + shift + o 는 임포트 문 자동으로 설정

public class ConsoleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력>> ");
		String name = sc.next();

		System.out.print("소속을 입력>> ");
		String company = sc.next();

		System.out.print("나이 입력>> ");
		String age = sc.next();

		System.out.println("당신의 이름은 " + name);
		System.out.println("당신의 소속은 " + company);
		System.out.println("당신의 나이는 " + age);
	}

}
