package chapter15;

public class annonymus {

	public enum Status {
		READY, SEND, COMPLETE, CLOSE;
	}

	public static MyInterface method() {
		return new MyInterface() {
			@Override
			public void print() {
				System.out.println("Test");
			}

		};
	}

	public static void main(String[] args) {

		MyInterface m = () -> System.out.println("Test");
		m.print();
	}

}
