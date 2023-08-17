package java_study.chapter11.sec10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {
		Map<String, Integer> price = new HashMap<>();

		// put method로 String 자료형인 Key와 Integer 자료형인 Value를 저장한다.
		price.put("아메리카노", 4500);
		price.put("바닐라 라떼", 5500);
		price.put("카라멜 마키야토", 5500);
		price.put("에스프레소", 4000);
		price.put("아보카도 스무디", 6000);

		// get메소드를 통해서 키에 접근해서 원하는 값을 출력한다.
		System.out.println("아보카도 스무디의 가격은? " + price.get("아보카도 스무디"));

		System.out.println();
		System.out.println("-----첫 번째 순회 방법 key와 value를 개별로 받아 처리-----");

		Set<String> keySet = price.keySet(); // keySet method : 저장된 모든 키 값을 Set에 저장한다.
		Iterator<String> keyIterator = keySet.iterator(); // iterator를 통해 순회 한다.
		while (keyIterator.hasNext()) { // 키 값이 없을 때 까지
			String key = keyIterator.next(); // 키 값을 key에 대입한다.
			Integer value = price.get(key); // get method : 주어진 키의 값을 리턴한다.
			System.out.println(key + " 가격은" + value + "원 입니다.");
		}

		System.out.println();
		System.out.println("-----두 번째 순회 방법 향상된 for문을 통해 처리-----");

		for (String s : price.keySet()) { // price 키의 값을 s에 저장한다.
			Integer value = price.get(s); // s키 값에 해당하는 값을 value에 저장한다.
			System.out.println(s + " 가격은" + value + "원 입니다.");
		}

		System.out.println();
		System.out.println("-----세 번째 순회 방법 Entry 객체를 통해 처리-----");

		Set<Map.Entry<String, Integer>> entrySet = price.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " 가격은" + value + "원 입니다.");
		}

	}

}
