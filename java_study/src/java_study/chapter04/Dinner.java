package java_study.chapter04;

import java.util.Scanner;

public class Dinner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���ῡ ���� ���� ���� ¥���, �쵿, ��� >> ");
		String food = sc.next();

		switch (food) {
		case "¥���":
			System.out.println("�߱������� ����");
			break;
		case "�쵿":
			System.out.println("�Ͻ������� ����");
			break;
		case "���":
			System.out.println("�н������� ����");
			break;
		default:
			System.out.println("������ �Ծ��!");
			break;
		}
	}

}
