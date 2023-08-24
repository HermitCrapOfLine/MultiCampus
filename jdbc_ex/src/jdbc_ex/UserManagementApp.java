package jdbc_ex;

import org.galapagos.common.ui.Application;
import org.galapagos.common.ui.Menu;
import org.galapagos.common.ui.MenuItem;

import jdbc_ex.command.UserAddCommand;
import jdbc_ex.command.UserDeleteCommand;
import jdbc_ex.command.UserDetailCommand;
import jdbc_ex.command.UserListCommand;
import jdbc_ex.command.UserUpdateCommand;
import jdbc_ex.common.JDBCUtil;

public class UserManagementApp extends Application {

	@Override
	public void cleanup() {
		super.cleanup();

		System.out.println("DB Connection Close");
		JDBCUtil.close();
	}

	@Override
	public void createMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.createMenu(menu);

		menu.add(new MenuItem("목록", new UserListCommand()));
		menu.add(new MenuItem("상세보기", new UserDetailCommand()));
		menu.add(new MenuItem("추가", new UserAddCommand()));
		menu.add(new MenuItem("수정", new UserUpdateCommand()));
		menu.add(new MenuItem("삭제", new UserDeleteCommand()));
	}

	public static void main(String[] args) {
		Application app = new UserManagementApp();
		app.run();

	}

}
