package java_study.chapter05;

public class ArrayEx9 {

	public static void main(String[] args) {
		int[] save = new int[5];
		ArrayUtil.getNumbers("숫자 입력>> ", save);

		int maxIx = ArrayUtil.findMaxValue(save, 0, save.length);
		int minIx = ArrayUtil.findMinValue(save, 0, save.length);

		System.out.printf("최고 점수는 : %d \n최저 점수는 : %d", save[maxIx], save[minIx]);

	}

}
