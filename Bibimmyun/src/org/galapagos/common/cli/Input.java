package org.galapagos.common.cli;

import java.util.Scanner;

public class Input {
	static Scanner sc = new Scanner(System.in);

	// Facade Pattern
	public static String read(String title) {
		System.out.print(title);
		return sc.nextLine();
	}

	public static int readInt(String title) {
		System.out.print(title);
		int answer = sc.nextInt();
		return answer;
	}
}
