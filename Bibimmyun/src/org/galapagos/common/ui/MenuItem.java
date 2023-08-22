package org.galapagos.common.ui;

import org.galapagos.common.command.Command;

// 1개의 메뉴를 나타냄
public class MenuItem {
	private String title; // 메뉴 제목(타이틀)
	private Command cmd; // 해당메뉴를 실행할 명령

	public MenuItem(String title, Command cmd) {
		super();
		this.title = title;
		this.cmd = cmd;
	}

	public String getTitle() {
		return title;
	}

	public void execute() {
		if (cmd != null) {
			cmd.execute();
		}
	}

}
