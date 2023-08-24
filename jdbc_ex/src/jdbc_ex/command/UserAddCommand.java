package jdbc_ex.command;

import org.galapagos.common.cli.Input;
import org.galapagos.common.command.Command;

import jdbc_ex.dao.UserDAO;
import jdbc_ex.dao.UserDAOImp1;
import jdbc_ex.domain.UserVO;

public class UserAddCommand implements Command {

	UserDAO dao = UserDAOImp1.getInstance();

	@Override
	public void execute() {
		System.out.println("[����� �߰�]");

		String userid = Input.read("����� ID: ");
		// id �ߺ� üũ
		UserVO user = dao.getUser(userid);

		if (user != null) { // �̹� �����ϴ� ID
			System.out.println("�̹� ������� ID�Դϴ�.");
			return;
		}

		String password = Input.read("��й�ȣ: ");
		String name = Input.read("�̸�: ");
		String role = Input.read("����: ");

		user = new UserVO(userid, password, name, role);
		dao.insertUser(user);
		System.out.println("==============================");
	}

}
