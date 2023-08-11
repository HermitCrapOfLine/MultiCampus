package java_study.chapter11.sec09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		List<String> initList = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");
		List<String> list1 = new ArrayList(initList);

		list1.set(0, "��浿");
		list1.remove(0);
		list1.add("��浿");

		for (String name : list1) {
			System.out.println(name);
		}

		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (int value : list2) {
			System.out.println(value);
		}

	}

}
