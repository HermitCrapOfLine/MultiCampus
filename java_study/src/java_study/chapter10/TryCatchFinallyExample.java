package java_study.chapter10;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		try { // Ʈ���� �� ����ó���� �Ѵ�.
			Class clazz = Class.forName("java.lang.String2");
			System.out.println(clazz);

		} catch (ClassNotFoundException e) { // ���ܸ� ��´�.
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
			// e.printStackTrace();
		} finally {
			System.out.println("===============");
		}
		System.out.println("���α׷� ����!!!");
	}

}
