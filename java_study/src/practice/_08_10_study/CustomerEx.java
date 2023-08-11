package practice._08_10_study;

public class CustomerEx {

	public static void main(String[] args) {
		Customer obj1 = new Customer("퀴리");
		Customer obj2 = new Customer("퀴리");

		if (obj1.equals(obj2)) {
			System.out.println("이름이 같아요");
		} else {
			System.out.println("이름이 달라요");
		}

	}

}
