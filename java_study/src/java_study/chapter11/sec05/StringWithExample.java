package java_study.chapter11.sec05;

import java.util.Scanner;

public class StringWithExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("파일명>> ");
		String ext = sc.nextLine();
		String test = ext.toLowerCase();
		boolean isMp3 = test.endsWith("mp3");

		if (isMp3) {
			System.out.println("mp3 파일이 맞습니다.");
		} else {
			System.out.println("mp3 파일이 아닙니다.");
		}
	}

}
