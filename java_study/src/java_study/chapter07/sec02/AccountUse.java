package java_study.chapter07.sec02;

public class AccountUse {

	public static void main(String[] args) {
		Account my1 = new Account("홍길동", "001224", 5000);
		System.out.println(my1);

		Account my2 = new Account("고길동", "030807", 50000);
		System.out.println(my2);
		System.out.println(my2.getMoney());

		my2.setMoney(1000000000);
		System.out.println(my2.getMoney());

//		Account my3 = new Account(); // 에러 

	}

}
