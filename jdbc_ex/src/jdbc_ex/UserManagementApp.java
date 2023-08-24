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

		menu.add(new MenuItem("���", new UserListCommand()));
		menu.add(new MenuItem("�󼼺���", new UserDetailCommand()));
		menu.add(new MenuItem("�߰�", new UserAddCommand()));
		menu.add(new MenuItem("����", new UserUpdateCommand()));
		menu.add(new MenuItem("����", new UserDeleteCommand()));
	}

	public static void main(String[] args) {
		Application app = new UserManagementApp();
		app.run();

	}

}
