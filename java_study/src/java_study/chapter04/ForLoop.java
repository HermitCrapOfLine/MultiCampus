package java_study.chapter04;

public class ForLoop {

	public static void main(String[] args) {
		System.out.println("����");
		long sum = 0;
		for (int i = 0; i < 1000000; i++) {
			sum += i;
		}
		System.out.println("�� " + sum);
	}

}
