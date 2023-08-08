package java_study.chapter07.sec07;

public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	static Singleton getInstance() {
		return singleton;
	}

	private String dbname = "bbs 데이터 베이스";

	public void open() {
		System.out.println(dbname + " 열기");
	}

	public void close() {
		System.out.println(dbname + " 닫기");
	}

	public void read() {
		System.out.println(dbname + " 읽기");
	}
}
