package java_study.chapter05;

public class PerfectScore {

	public static void main(String[] args) {
//		int[] jumsu = new int[10000];
//		Random r = new Random();
//		for (int i = 0; i < jumsu.length; i++) {
//			jumsu[i] = r.nextInt(331); // 0 ~ 330
//		}

		int[] jumsu = ArrayUtil.getRandomArray(10000, 331);

		// ���� ������ ���� �� ���ϱ��?
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 330) {
				count++;
				System.out.println(count + ": ������ ��ȣ�� " + i + "��");
			}
		}
		System.out.println("��ü ������ ���� " + count + "��");
	}

}
