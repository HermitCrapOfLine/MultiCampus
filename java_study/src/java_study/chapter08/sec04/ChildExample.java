package java_study.chapter08.sec04;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child);

		Parent parent = child; // 자동 타입변환
		System.out.println(parent);

		parent.method1();
		parent.method2();

		child.method1();
		child.method2();
		child.method3();
	}

}
