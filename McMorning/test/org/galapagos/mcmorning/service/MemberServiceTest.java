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
		// 로그인 성공시 'xxx 님 환영합니다. 출력
		// 로그인 실패시 에러 메시지 출력
		if (m != null) {
			System.out.println(m.getUserid() + "님 환영합니다.");
			System.out.println("로그인이 되지 않았습니다.");
		} else {
			System.out.println("사용자 ID 또는 비밀번호가 올바르지 않습니다.");
		}
	}

	static void testsearchByName() {
		MemberService service = new MemberService(new MemberMapDao());
		service.searchByName();
	}

}
