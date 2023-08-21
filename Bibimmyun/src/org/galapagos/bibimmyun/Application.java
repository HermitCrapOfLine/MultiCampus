package org.galapagos.bibimmyun;

import org.galapagos.common.cli.Input;

public class Application {

	public static void main(String[] args) {

		while (true) {
			System.out.println("1]목록 2]검색 3]종료");
			int sel = Input.readInt("선택 > ");
			if (sel == 1) {
				// 실제 목록 보기 실행 생략
				System.out.println("목록 실행");
			} else if (sel == 2) {
				System.out.println("검색 실행");
			} else if (sel == 3) {
				System.exit(0);
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}

	}

}
