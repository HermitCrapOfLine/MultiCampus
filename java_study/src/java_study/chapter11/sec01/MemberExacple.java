package java_study.chapter11.sec01;

public class MemberExacple {

	public static void main(String[] args) {
		Member obj1 = new Member("blue", 10);
		Member obj2 = new Member("blue", 20);
		Member obj3 = new Member("red", 30);

		String obj4 = new String("blue");

		if (obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}

		System.out.println(obj1.equals(obj4));

	}

}
