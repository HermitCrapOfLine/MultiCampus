package java_study.chapter04;

import java.util.Date;

public class ManyCondition {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.printf("%d�� %d�� %d�� \n", hour, min, sec);

		int year = date.getYear();
		int month = date.getMonth() + 1;
		int today = date.getDate();
		System.out.println(year + 1900 + "�� " + month + "�� " + today + "��");

		System.out.printf("%4d-%02d-%02d %02d:%02d:%02d \n", year + 1900, month, today, hour, min, sec);
	}

}
