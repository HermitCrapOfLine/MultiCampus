package java_study.chapter05;

public class PerfectScore {

	public static void main(String[] args) {
//		int[] jumsu = new int[10000];
//		Random r = new Random();
//		for (int i = 0; i < jumsu.length; i++) {
//			jumsu[i] = r.nextInt(331); // 0 ~ 330
//		}

		int[] jumsu = ArrayUtil.getRandomArray(10000, 331);

		// 수능 만점자 수는 몇 명일까요?
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 330) {
				count++;
				System.out.println(count + ": 만점자 번호는 " + i + "번");
			}
		}
		System.out.println("전체 만점자 수는 " + count + "명");
	}

}
