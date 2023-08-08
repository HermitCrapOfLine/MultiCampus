package java_study.chapter02;

public class 기본데이터2 {

	public static void main(String[] args) {
		// 정수 => int;
		byte age = 100; // -128 ~ 127
		short wallet = 20000; // -3만 ~ 3만
		int money = 500000000; // -21억 ~ 21억
		long space = 100000000000L; // 21억 이상
		System.out.println("내 은행에 든 돈: " + money + "원");

		// 실수 => double
		double heigth = 185.5; // 거의 모든 소숫점
		float weight = 88.8f;
		System.out.println("내 키는 : " + heigth);

		// 문자 => 한 글자
		char gender = '남';
		System.out.println("내 성별은 " + gender);

		String name = "홍길동";
		System.out.println("내 이름은: " + name);
	}

}
