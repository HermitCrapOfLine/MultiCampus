package java_study.chapter11.sec09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample3 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;

		startTime = System.nanoTime();

		for (int i = 0; i < 1000000; i++) {
			list1.add(0, String.valueOf(i));
		}

		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð�: " + (endTime - startTime) + " ns");

		long startTime2;
		long endTime2;

		startTime2 = System.nanoTime();

		for (int i = 0; i < 1000000; i++) {
			list2.add(0, String.valueOf(i));
		}

		endTime2 = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð�: " + (endTime2 - startTime2) + " ns");

	}

}
