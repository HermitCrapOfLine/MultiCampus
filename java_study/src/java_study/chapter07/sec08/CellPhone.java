package java_study.chapter07.sec08;

public class CellPhone { // 상속을 지정하지 않으면 Object(자바 최상위 클래스)가 부모이다.
	String model;
	String color;

	public CellPhone() {

	}

	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");
	}

	void sendVoid(String message) {
		System.out.println("자기: " + message);
	}

	void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}

	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
