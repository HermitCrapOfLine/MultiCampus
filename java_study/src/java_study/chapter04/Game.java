package java_study.chapter04;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		int meWin = 0; // 나 승
		int comWin = 0; // 컴 승
		int draw = 0; // 비김

		final int SCOSSPRS = 0;
		final int ROCK = 1;
		final int PAPER = 2;

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		while (true) {

			int computer = r.nextInt(3); // 3은 미포함 SCOSSPRS,1,2 중에서 랜덤하게 정함
			System.out.println("0:가위, 1:바위, 2:보, -1종료 >>");
			int me = sc.nextInt();

			// 종료 조건 확인 후 진행
			if (me == -1) { // 종료 조건
				int sum = meWin + comWin;
				double result = (double) meWin / sum * 100;
				System.out.println("게임을 끝냅니다.");
				System.out.println("게임 결과 - 나의 승: " + meWin + ", 컴퓨터의 승: " + comWin + ", 비김: " + draw);
				System.out.printf("컴퓨터와 게임을 한 승률은 %.1f%% 입니다.", result);
				break;
			}

			System.out.printf("컴퓨터 : %d, 나 : %d", computer, me);

			if (me == computer) { // 비긴거
				draw++;
				System.out.println("비겼습니다.");
			} else if ((me == SCOSSPRS && computer == PAPER) || (me == ROCK && computer == SCOSSPRS)
					|| (me == PAPER && computer == ROCK)) {
				meWin++;
				System.out.println("내가 이겼습니다.");// 내가 이긴경우
			} else { // 내가 진 경우
				comWin++;
				System.out.println("컴퓨터가 이겼습니다.");
			}
		}

	}
}