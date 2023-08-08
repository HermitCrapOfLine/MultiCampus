package java_study.chapter04;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		int meWin = 0; // �� ��
		int comWin = 0; // �� ��
		int draw = 0; // ���

		final int SCOSSPRS = 0;
		final int ROCK = 1;
		final int PAPER = 2;

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		while (true) {

			int computer = r.nextInt(3); // 3�� ������ SCOSSPRS,1,2 �߿��� �����ϰ� ����
			System.out.println("0:����, 1:����, 2:��, -1���� >>");
			int me = sc.nextInt();

			// ���� ���� Ȯ�� �� ����
			if (me == -1) { // ���� ����
				int sum = meWin + comWin;
				double result = (double) meWin / sum * 100;
				System.out.println("������ �����ϴ�.");
				System.out.println("���� ��� - ���� ��: " + meWin + ", ��ǻ���� ��: " + comWin + ", ���: " + draw);
				System.out.printf("��ǻ�Ϳ� ������ �� �·��� %.1f%% �Դϴ�.", result);
				break;
			}

			System.out.printf("��ǻ�� : %d, �� : %d", computer, me);

			if (me == computer) { // ����
				draw++;
				System.out.println("�����ϴ�.");
			} else if ((me == SCOSSPRS && computer == PAPER) || (me == ROCK && computer == SCOSSPRS)
					|| (me == PAPER && computer == ROCK)) {
				meWin++;
				System.out.println("���� �̰���ϴ�.");// ���� �̱���
			} else { // ���� �� ���
				comWin++;
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
		}

	}
}