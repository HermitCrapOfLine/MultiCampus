package practice.inter;

public class InterfaceExample implements Sample {

	// �ڱ� �ڽ��� ���ϴ� �޼ҵ�

	@Override
	public int addScore(int a) {
		a += a;
		return a;
	}

	// �ڱ� �ڽ��� ���� �޼ҵ�

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
