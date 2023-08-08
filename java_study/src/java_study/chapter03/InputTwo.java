package java_study.chapter03;

public class InputTwo {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 4;

		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2); // * 정수/정수 -> 정수(몫)
		System.out.println(n1 / 4.0); // 정수/실수 -> 실수

		System.out.println(n1 / (double) n2); // 캐스팅 연산자가 나누기 보다 우선순위가 높다.
	}

}
