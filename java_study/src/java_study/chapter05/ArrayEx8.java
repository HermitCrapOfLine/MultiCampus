package java_study.chapter05;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[] jumsu = new int[5];

		ArrayUtil.getNumbers("¡°ºˆ >> ", jumsu);
		ArrayUtil.showNumbers(jumsu);
		int sum = ArrayUtil.addAll(jumsu);

		double avg = (double) sum / jumsu.length;

		System.out.println("∆Ú±’¿∫: " + avg);
	}

}
