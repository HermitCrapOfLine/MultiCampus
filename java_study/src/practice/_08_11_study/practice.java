package practice._08_11_study;

import java.util.ArrayList;
import java.util.List;

public class practice {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // ��� ����Ʈ ����
		System.out.println("---�����ϱ� ��");
		list.add(10); // add ����Ʈ�� ���� �ִ´�.
		list.add(20);
		list.add(30);
		for (int x : list) {
			System.out.println(x);
		}
		System.out.println("---������ ��");
		list.remove(0); // 0��° �ε��� �� 10�� �����Ѵ�.
		for (int x : list) {
			System.out.println(x);
		}
	}
}
