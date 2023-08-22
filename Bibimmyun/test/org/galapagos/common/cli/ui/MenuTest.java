package org.galapagos.common.cli.ui;

import org.galapagos.bibimmyun.command.ExitCommand;
import org.galapagos.bibimmyun.command.ListCommand;
import org.galapagos.bibimmyun.command.SearchCommand;
import org.galapagos.common.ui.Application;
import org.galapagos.common.ui.Menu;
import org.galapagos.common.ui.MenuItem;

public class MenuTest {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Application app = new Application();

		app.createMenu(menu);

		menu.add(new MenuItem("���", new ListCommand()));
		menu.add(new MenuItem("�˻�", new SearchCommand()));
		menu.add(new MenuItem("�߰�", null));
		menu.add(new MenuItem("����", new ExitCommand()));

		while (true) {
			menu.print();
			MenuItem item = menu.select();
			if (item != null) {
				item.execute();
			}
		}
	}

}
