package java_study.chapter03;

import javax.swing.JOptionPane;

public class StringCompare2 {

	public static void main(String[] args) {
		String id = "root";
		String pw = "pass";

		String inputid = JOptionPane.showInputDialog("아이디 입력");
		String inputpw = JOptionPane.showInputDialog("패스워드 입력");

		if (id.equals(inputid) && pw.equals(inputpw)) {
			System.out.println("로그인 ok");
		} else {
			System.out.println("로그인 not");
		}
	}

}
