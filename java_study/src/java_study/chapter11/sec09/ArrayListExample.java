package java_study.chapter11.sec09;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Java");
		list.add("iBATIS");

		System.out.println(list);

		int size = list.size();
		System.out.println("�� ��ü��: " + size);
		System.out.println();

		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
	}

}
