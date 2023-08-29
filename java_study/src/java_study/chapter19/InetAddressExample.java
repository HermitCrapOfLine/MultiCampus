package java_study.chapter19;

import java.net.InetAddress;

public class InetAddressExample {
	public static void main(String[] args) {

		try {

			InetAddress local = InetAddress.getLocalHost();
			// getHostAddress : String ��ȯ
			System.out.println("�� ��ǻ�� IP�ּ�: " + local.getHostAddress());

			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP�ּ�: " + remote.getHostAddress());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
