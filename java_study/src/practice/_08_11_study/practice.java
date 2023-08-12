package practice._08_11_study;

import java.util.ArrayList;
import java.util.List;

public class practice {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // 어레이 리스트 생성
		System.out.println("---제거하기 전");
		list.add(10); // add 리스트에 값을 넣는다.
		list.add(20);
		list.add(30);
		for (int x : list) {
			System.out.println(x);
		}
		System.out.println("---제거한 후");
		list.remove(0); // 0번째 인덱스 값 10을 제거한다.
		for (int x : list) {
			System.out.println(x);
		}
	}
}
