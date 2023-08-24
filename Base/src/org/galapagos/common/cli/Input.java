package org.galapagos.common.cli;

import java.util.Scanner;

public class Input {
	static Scanner sc = new Scanner(System.in);

	// Facade Pattern
	public static String read(String title) {
		System.out.print(title);
		return sc.nextLine();
	}

	public static String read(String title, String defaultValue) {
		// �̸� (��浿):
		System.out.printf("%s(%s): ", title, defaultValue);
		String answer = sc.nextLine();

		// �׳� ���� ������ defaultValue ����, �Է°��� ������ answer ����

		return answer.isEmpty() ? defaultValue : answer;

	}

	public static int readInt(String title) {
		System.out.print(title);
		int answer = sc.nextInt();
		sc.nextLine();
		return answer;
	}

	public static boolean confirm(String title) {
		return confirm(title, true);
	}

	public static boolean confirm(String title, boolean defaultValue) {

		String yesNo = defaultValue ? "(Y/n)" : "(y/N)";
		System.out.printf("%s %s: ", title, yesNo);

		String answer = sc.nextLine();
		if (answer.isEmpty())
			return defaultValue;

		return answer.equalsIgnoreCase("y");

		// return answer.isEmpty() ? defaultValue : answer.equalsIgnoreCase("y");
	}

}
