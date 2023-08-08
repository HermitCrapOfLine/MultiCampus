package java_study.chapter06.sec5;

public class Cafe {
	private String name; // �������
	private String menu;
	private int price;

	// Ŭ������ �̸��� �����ϴ�.

	public Cafe() { // �Ű������� ���� �ʴ� �⺻ ������

	}

	public Cafe(String name, String menu, int price) { // �Ű����� name�� �޴� ������
		this.name = name;
		this.menu = menu;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Cafe [name=" + name + ", menu=" + menu + ", price=" + price + "]";
	}

}