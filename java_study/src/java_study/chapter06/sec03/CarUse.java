package java_study.chapter06.sec03;

public class CarUse {

	public static void main(String[] args) {
		Car car1 = new Car();

		car1.color = "ȸ��";
		System.out.println(car1.color);
		car1.run();

		Car car2 = new Car();
		car2.color = "�Ķ���";
		System.out.println(car2.color);
		car2.run();
		car2.up();
	}

}