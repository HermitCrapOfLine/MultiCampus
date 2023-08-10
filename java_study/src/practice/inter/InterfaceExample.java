package practice.inter;

public class InterfaceExample implements Sample {

	// 자기 자신을 더하는 메소드

	@Override
	public int addScore(int a) {
		a += a;
		return a;
	}

	// 자기 자신을 빼는 메소드

	@Override
	public int minusScore(int b) {
		b += b;
		return b;
	}

	public static void main(String[] args) {
		int number = 10;

		for (int i = 0; i < 3; i++) {
			addScore(number);
		}

	}

}
