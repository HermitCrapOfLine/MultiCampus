package java_study.chapter05;

public class ArrayEx9 {

	public static void main(String[] args) {
		int[] save = new int[5];
		ArrayUtil.getNumbers("���� �Է�>> ", save);

		int maxIx = ArrayUtil.findMaxValue(save, 0, save.length);
		int minIx = ArrayUtil.findMinValue(save, 0, save.length);

		System.out.printf("�ְ� ������ : %d \n���� ������ : %d", save[maxIx], save[minIx]);

	}

}
