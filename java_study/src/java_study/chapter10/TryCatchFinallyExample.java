package java_study.chapter10;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		try { // 트라이 블럭 예외처리를 한다.
			Class clazz = Class.forName("java.lang.String2");
			System.out.println(clazz);

		} catch (ClassNotFoundException e) { // 예외를 잡는다.
			System.out.println("클래스가 존재하지 않습니다.");
			// e.printStackTrace();
		} finally {
			System.out.println("===============");
		}
		System.out.println("프로그램 종료!!!");
	}

}
