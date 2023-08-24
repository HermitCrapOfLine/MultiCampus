package jdbc_ex.command;

import org.galapagos.common.cli.Input;
import org.galapagos.common.command.Command;

import jdbc_ex.dao.UserDAO;
import jdbc_ex.dao.UserDAOImp1;
import jdbc_ex.domain.UserVO;

public class UserUpdateCommand implements Command {
	UserDAO dao = UserDAOImp1.getInstance();

	@Override
	public void execute() {
		System.out.println("[����� ���� ����]");

		// 1. ������ userid �Է�
		// 2. ���� ������ ���
		// 3. ���� ������ �����ְ� ������Ʈ ����
		// 4. ������Ʈ

		String userid = Input.read("����� ID: ");
		UserVO user = dao.getUser(userid);
		if (user == null) {
			System.out.println("�������� �ʴ� ID�Դϴ�.");
			return;
		}

		// �̸� ��Ʈ
		// �̸� (��浿):
		String name = Input.read("�̸�", user.getName());
		String role = Input.read("����", user.getRole());

		user.setName(name);
		user.setRole(role);

		dao.updateUser(user);

	}

}
