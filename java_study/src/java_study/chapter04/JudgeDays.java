package java_study.chapter04;

import java.util.Scanner;

public class JudgeDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ���� 1) �ָ� 2) ������ 3)");
		int data = sc.nextInt();
		if (data == 1) {
			System.out.println("������ �����սô�!!");
		} else if (data == 2) {
			System.out.println("������ ��ƺ��ô�!!");
		} else {
			System.out.println("�����ϵ� ��ƾ���!!");
		}

	}

}
