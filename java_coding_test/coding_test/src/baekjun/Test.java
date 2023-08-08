package baekjun;

import java.util.Scanner;

public class Test {

	public static String solution(String str) {
		String answer = "";
		char[] cArr = str.toCharArray();
		int lt = 0;
		int rt = cArr.length - 1;

		for (int i = 0; i < cArr.length; i++) {
			if (!(65 <= cArr[lt] && cArr[lt] <= 122)) {
				lt++;
			} else if (!(65 <= cArr[rt] && cArr[rt] <= 122)) {
				rt--;
			} else {
				char tmp = cArr[lt];
				cArr[lt] = cArr[rt];
				cArr[rt] = tmp;
			}

			if (lt > rt || rt < lt) {
				break;
			}

		}
		for (int i = 0; i < cArr.length; i++) {
			answer += cArr[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
