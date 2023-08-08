package java_study.chapter05;

public class ArrayEx1 {

	// new 는 Heap영역에 할당

	public static void main(String[] args) {
		double[] height = { 123.4, 234.2, 124.5 };
		double[] space = new double[500];
		char[] gender = { '남', '여', '남' };
		String[] space2 = new String[333];

		System.out.println(space);
		System.out.println(space[0]);

		System.out.println(space2);
		System.out.println(space2[0]);

	}

}
