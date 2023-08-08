package java_study.chapter06.sec02;

public class MyRoom {

	public static void main(String[] args) {
		TV myTv = new TV();
		myTv.brand = "LG";
		myTv.price = 1000000;
		myTv.size = 60;
		myTv.store = "아마존";

		System.out.printf("TV의 제원 : 브랜드는 %s 가격은 %d원 크기는 %d인치 구매처는 %s이다.\n", myTv.brand, myTv.price, myTv.size,
				myTv.store);
		myTv.turnOn();
		myTv.changeChannel();
		myTv.turnOff();
	}

}
