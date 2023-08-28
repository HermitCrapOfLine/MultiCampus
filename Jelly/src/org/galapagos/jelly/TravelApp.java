package org.galapagos.jelly;

import org.galapagos.common.ui.Application;
import org.galapagos.common.ui.Menu;
import org.galapagos.common.ui.MenuItem;
import org.galapagos.jelly.command.TravelDetailCommand;
import org.galapagos.jelly.command.TravelListCommand;
import org.galapagos.jelly.command.TravelRegionCommand;
import org.galapagos.jelly.command.TravelSearchCommand;

public class TravelApp extends Application {

	public static void main(String[] args) {

		Application app = new TravelApp();
		app.run();

	}

	@Override
	public void createMenu(Menu menu) {
		super.createMenu(menu);

		menu.add(new MenuItem("���", new TravelListCommand()));
		menu.add(new MenuItem("�˻�", new TravelSearchCommand()));
		menu.add(new MenuItem("�󼼺���", new TravelDetailCommand()));
		menu.add(new MenuItem("�ǿ�������", new TravelRegionCommand()));

	}

	@Override
	public void cleanup() {
		// TODO Auto-generated method stub
		super.cleanup();
	}
}
