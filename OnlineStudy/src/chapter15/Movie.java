package chapter15;

public class Movie implements Runnable {

	@Override
	public void run() {

		Food work1 = new Food();
		Phone work2 = new Phone();

		work1.start();
		work2.start();

		for (int i = 1; i <= 1000; i++) {
			System.out.println("���� : " + i);
		}
	}

}

class Food extends Thread {
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("���� �Ա�: " + i);
		}
	}
}

class Phone extends Thread {
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("��ȭ �ޱ�: " + i);
		}
	}
}