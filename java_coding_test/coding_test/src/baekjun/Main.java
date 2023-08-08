package baekjun;

import java.util.Scanner;

public class Main {
	
	public int solution(String str) {
		String answer = "";
		for (char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
			}
			
		}
		
		return Integer.parseInt(answer);
		
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}

}
