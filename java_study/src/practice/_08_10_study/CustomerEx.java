package practice._08_10_study;

public class CustomerEx {

	public static void main(String[] args) {
		Customer obj1 = new Customer("����");
		Customer obj2 = new Customer("����");

		if (obj1.equals(obj2)) {
			System.out.println("�̸��� ���ƿ�");
		} else {
			System.out.println("�̸��� �޶��");
		}

	}

}
