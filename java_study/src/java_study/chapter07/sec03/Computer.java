package java_study.chapter07.sec03;

public class Computer {

	private int price;
	private String maker;
	private int monitor;

	public Computer() {

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getMonitor() {
		return monitor;
	}

	public void setMonitor(int monitor) {
		this.monitor = monitor;
	}

	public Computer(int price, String maker, int monitor) {
		super();
		this.price = price;
		this.maker = maker;
		this.monitor = monitor;
	}

	@Override
	public String toString() {
		return "Computer [price=" + price + ", maker=" + maker + ", monitor=" + monitor + "]";
	}

}
