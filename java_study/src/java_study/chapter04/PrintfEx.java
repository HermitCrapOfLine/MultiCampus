package java_study.chapter04;

public class PrintfEx {

	public static void main(String[] args) {
		double value = 12.345679;
		String result = "���� ��";

		System.out.printf("��� ���� ! %f \n", value);
		System.out.printf("��� ���� ! %.3f \n", value);
		System.out.printf("%s�� %.2f �Դϴ�. \n", result, value);
	}

}
