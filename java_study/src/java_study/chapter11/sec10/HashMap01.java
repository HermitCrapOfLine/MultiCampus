package java_study.chapter11.sec10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {
		Map<String, Integer> price = new HashMap<>();

		// put method�� String �ڷ����� Key�� Integer �ڷ����� Value�� �����Ѵ�.
		price.put("�Ƹ޸�ī��", 4500);
		price.put("�ٴҶ� ��", 5500);
		price.put("ī��� ��Ű����", 5500);
		price.put("����������", 4000);
		price.put("�ƺ�ī�� ������", 6000);

		// get�޼ҵ带 ���ؼ� Ű�� �����ؼ� ���ϴ� ���� ����Ѵ�.
		System.out.println("�ƺ�ī�� �������� ������? " + price.get("�ƺ�ī�� ������"));

		System.out.println();
		System.out.println("-----ù ��° ��ȸ ��� key�� value�� ������ �޾� ó��-----");

		Set<String> keySet = price.keySet(); // keySet method : ����� ��� Ű ���� Set�� �����Ѵ�.
		Iterator<String> keyIterator = keySet.iterator(); // iterator�� ���� ��ȸ �Ѵ�.
		while (keyIterator.hasNext()) { // Ű ���� ���� �� ����
			String key = keyIterator.next(); // Ű ���� key�� �����Ѵ�.
			Integer value = price.get(key); // get method : �־��� Ű�� ���� �����Ѵ�.
			System.out.println(key + " ������" + value + "�� �Դϴ�.");
		}

		System.out.println();
		System.out.println("-----�� ��° ��ȸ ��� ���� for���� ���� ó��-----");

		for (String s : price.keySet()) { // price Ű�� ���� s�� �����Ѵ�.
			Integer value = price.get(s); // sŰ ���� �ش��ϴ� ���� value�� �����Ѵ�.
			System.out.println(s + " ������" + value + "�� �Դϴ�.");
		}

		System.out.println();
		System.out.println("-----�� ��° ��ȸ ��� Entry ��ü�� ���� ó��-----");

		Set<Map.Entry<String, Integer>> entrySet = price.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " ������" + value + "�� �Դϴ�.");
		}

	}

}
