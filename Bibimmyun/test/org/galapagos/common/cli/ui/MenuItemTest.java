package org.galapagos.common.cli.ui;

import org.galapagos.bibimmyun.command.ExitCommand;
import org.galapagos.bibimmyun.command.ListCommand;
import org.galapagos.bibimmyun.command.SearchCommand;
import org.galapagos.common.ui.MenuItem;

public class MenuItemTest {

	public static void main(String[] args) {
		MenuItem listItem = new MenuItem("���", new ListCommand());
		MenuItem searchItem = new MenuItem("�˻�", new SearchCommand());
		MenuItem exitItem = new MenuItem("����", new ExitCommand());

		System.out.println(listItem.getTitle());
		System.out.println(searchItem.getTitle());
		System.out.println(exitItem.getTitle());
		listItem.execute();
	}

}
