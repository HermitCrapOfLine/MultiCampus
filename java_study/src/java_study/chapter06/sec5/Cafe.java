package java_study.chapter06.sec5;

public class Cafe {
	private String name; // 멤버변수
	private String menu;
	private int price;

	// 클래스의 이름과 동일하다.

	public Cafe() { // 매개변수를 받지 않는 기본 생성자

	}

	public Cafe(String name, String menu, int price) { // 매개변수 name을 받는 생성자
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