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
		System.out.println("[User 상세 보기]");

		String userid = Input.read("사용자 ID: ");
		UserVO user = dao.getUser(userid);
		if (user == null) {
			System.out.println("존재하지 않는 ID입니다.");
			return;
		}

		boolean answer = Input.confirm("정말 삭제할까요?");
		if (answer) {
			dao.deleteUser(user.getId());
			System.out.println(userid + "를 삭제했습니다.");
		}
	}

}
