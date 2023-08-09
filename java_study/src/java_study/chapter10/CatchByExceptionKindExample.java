package java_study.chapter10;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {

		try {
			System.out.println(args[0]);
			System.out.println(args[1]);

			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[1]);
			System.out.println(value1 + value2);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();

		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
