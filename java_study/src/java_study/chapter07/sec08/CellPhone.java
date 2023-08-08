package java_study.chapter07.sec08;

public class CellPhone { // ����� �������� ������ Object(�ڹ� �ֻ��� Ŭ����)�� �θ��̴�.
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
		System.out.println("������ �մϴ�.");
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}

	void sendVoid(String message) {
		System.out.println("�ڱ�: " + message);
	}

	void receiveVoice(String message) {
		System.out.println("����: " + message);
	}

	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}

}
