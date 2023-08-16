package org.galapagos.mcmorning.service;

import org.galapagos.mcmorning.dao.MemberMapDao;
import org.galapagos.mcmorning.exception.UserIdCountOverException;
import org.galapagos.mcmorning.vo.Member;

public class MemberServiceTest {

	public static void main(String[] args) {
		// testInputMember();
		// testLogin();
		testsearchByName();
	}

	static void testInputMember() {
		MemberService service = new MemberService(new MemberMapDao());

		Member m;
		try {
			m = service.inputMember();
			System.out.println(m);
		} catch (UserIdCountOverException e) {
			System.out.println(e.getMessage());
		}

	}

	static void testLogin() {
		MemberService service = new MemberService(new MemberMapDao());
		Member m = service.login();

		System.out.println(m);
		// �α��� ������ 'xxx �� ȯ���մϴ�. ���
		// �α��� ���н� ���� �޽��� ���
		if (m != null) {
			System.out.println(m.getUserid() + "�� ȯ���մϴ�.");
			System.out.println("�α����� ���� �ʾҽ��ϴ�.");
		} else {
			System.out.println("����� ID �Ǵ� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
		}
	}

	static void testsearchByName() {
		MemberService service = new MemberService(new MemberMapDao());
		service.searchByName();
	}

}
