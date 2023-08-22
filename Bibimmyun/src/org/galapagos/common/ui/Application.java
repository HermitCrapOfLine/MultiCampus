package org.galapagos.common.ui;

import org.galapagos.bibimmyun.command.ExitCommand;

public class Application {

	private Menu menu;

	public void createMenu(Menu menu) {

	}

	public void init() {
		menu = new Menu();
		createMenu(menu);
		menu.add(new MenuItem("Á¾·á", new ExitCommand()));
	}

	public void run() {
		init();
		while (true) {
			menu.print();
			MenuItem item = menu.select();
			if (item != null)
				item.execute();
		}
	}

}
