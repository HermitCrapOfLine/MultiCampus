package java_study.chapter07.sec07;

public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	static Singleton getInstance() {
		return singleton;
	}

	private String dbname = "bbs ������ ���̽�";

	public void open() {
		System.out.println(dbname + " ����");
	}

	public void close() {
		System.out.println(dbname + " �ݱ�");
	}

	public void read() {
		System.out.println(dbname + " �б�");
	}
}
