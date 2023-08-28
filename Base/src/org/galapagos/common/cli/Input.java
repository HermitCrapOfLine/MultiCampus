package org.galapagos.common.cli;

import java.util.List;
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

	public static <T> T select(String title, List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			T el = list.get(i);
			System.out.printf("%d) %s\n", (i + 1), el);
		}

		int sel = readInt(title);
		return list.get(sel - 1);

	}

}
