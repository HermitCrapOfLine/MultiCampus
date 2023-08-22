package org.galapagos.bibimmyun;

import org.galapagos.bibimmyun.command.ListCommand;
import org.galapagos.bibimmyun.command.SearchCommand;
import org.galapagos.common.ui.Application;
import org.galapagos.common.ui.Menu;
import org.galapagos.common.ui.MenuItem;

public class ContactApp extends Application {

	@Override
	public void createMenu(Menu menu) {
		super.createMenu(menu);

		menu.add(new MenuItem("���", new ListCommand()));
		menu.add(new MenuItem("�˻�", new SearchCommand()));
		menu.add(new MenuItem("�߰�", null));
	}

	public static void main(String[] args) {
		ContactApp app = new ContactApp();
		app.run();
	}

}
