package java_study.chapter04;

public class WhileEx2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1~" + (i - 1) + " гу : " + sum);
	}

}
