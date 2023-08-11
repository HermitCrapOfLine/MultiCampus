package org.galapagos.mcmorning.service;

import org.galapagos.mcmorning.cli.Input;
import org.galapagos.mcmorning.dao.MemberDao;
import org.galapagos.mcmorning.exception.UserIdCountOverException;
import org.galapagos.mcmorning.vo.Member;

public class MemberService {
	MemberDao dao = new MemberDao();

	public void signUp() {
		// Member ���� �Է�
		// id �ߺ� üũ
		// ����Ʈ �ֱ�(Dao)

		Member member;
		try {
			member = inputMember();
			dao.add(member);

		} catch (

		UserIdCountOverException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
	}

	public Member inputMember() throws UserIdCountOverException {

		String userid = inputUserid();
		String password = Input.read("��й�ȣ : ");
		String name = Input.read("�̸� : ");
		String email = Input.read("email : ");

		Member member = new Member(userid, password, name, email);
		return member;
	}

	public String inputUserid() throws UserIdCountOverException {
		String userid = "";
		for (int i = 0; i < 3; i++) {
			userid = Input.read("����� ID : ");
			Member m = dao.findByUserid(userid);

			if (m != null) { // �ߺ��̸�
				System.out.println(userid + "�� �ߺ��� ID�Դϴ�.");
			} else {
				return userid;
			}
		}
		throw new UserIdCountOverException();
	}
}
