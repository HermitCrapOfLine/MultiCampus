package practice._08_10_study;

public class StringEx {

	public static void main(String[] args) {
		String str = "안녕하세요 오늘도 좋은 하루 되세요 !!";

		System.out.println(str.charAt(0));

		System.out.println(str.indexOf("하루"));

		System.out.println(str.replace('요', '용'));

		System.out.println(str.substring(10));

		System.out.println(str.startsWith("안녕하세요"));

		System.out.println(str.endsWith("되세요"));

	}

}
