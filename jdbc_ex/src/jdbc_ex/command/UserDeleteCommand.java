package jdbc_ex.command;

import org.galapagos.common.cli.Input;
import org.galapagos.common.command.Command;

import jdbc_ex.dao.UserDAO;
import jdbc_ex.dao.UserDAOImp1;
import jdbc_ex.domain.UserVO;

public class UserDeleteCommand implements Command {

	UserDAO dao = UserDAOImp1.getInstance();

	@Override
	public void execute() {
		System.out.println("[User �� ����]");

		String userid = Input.read("����� ID: ");
		UserVO user = dao.getUser(userid);
		if (user == null) {
			System.out.println("�������� �ʴ� ID�Դϴ�.");
			return;
		}

		boolean answer = Input.confirm("���� �����ұ��?");
		if (answer) {
			dao.deleteUser(user.getId());
			System.out.println(userid + "�� �����߽��ϴ�.");
		}
	}

}
