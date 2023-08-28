package baekjun;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public int solution(int n, int[] arr) {
		int answer = 0;
		int count = 0;
		for (int x : arr) {
			if (x == 1) {
				count++;
				answer += count;
			}else {
				count = 0;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, arr));
		
		
		
		}
	}

