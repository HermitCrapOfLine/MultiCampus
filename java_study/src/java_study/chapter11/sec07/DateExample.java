package java_study.chapter11.sec07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date current = new Date();
		String strCurrent1 = current.toString();
		System.out.println(current);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��mm��dd�� hh��mm��ss��");
		String strCurrent2 = sdf.format(current);
		System.out.println(strCurrent2);
	}

}
