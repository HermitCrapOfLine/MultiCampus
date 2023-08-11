package baekjun;

import java.util.Scanner;

public class Main {
	
	public String solution(String str, int num) {
		String answer = "";
		for (int i = 0; i < num; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int number = Integer.parseInt(tmp, 2);
			str = str.substring(7);
			answer += (char)number;
		}
		
		
		return answer; 
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int number = kb.nextInt();
		String str = kb.next();
		
		System.out.println(T.solution(str, number));
	}

}
