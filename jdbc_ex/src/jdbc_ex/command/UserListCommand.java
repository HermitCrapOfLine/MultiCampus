package jdbc_ex.command;

import java.util.List;

import org.galapagos.common.command.Command;

import jdbc_ex.dao.UserDAO;
import jdbc_ex.dao.UserDAOImp1;
import jdbc_ex.domain.UserVO;

public class UserListCommand implements Command {
	UserDAO dao = UserDAOImp1.getInstance();

	@Override
	public void execute() {
		System.out.println("[User 목록 보기]");
		List<UserVO> list = dao.getUserList();
		for (int i = 0; i < list.size(); i++) {
			UserVO user = list.get(i);
			System.out.printf("%d] %s\n", (i + 1), user.getId());
		}
	}

}
