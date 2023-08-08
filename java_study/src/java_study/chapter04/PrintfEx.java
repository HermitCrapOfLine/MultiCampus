package java_study.chapter04;

public class PrintfEx {

	public static void main(String[] args) {
		double value = 12.345679;
		String result = "작은 값";

		System.out.printf("계산 나와 ! %f \n", value);
		System.out.printf("계산 나와 ! %.3f \n", value);
		System.out.printf("%s은 %.2f 입니다. \n", result, value);
	}

}
