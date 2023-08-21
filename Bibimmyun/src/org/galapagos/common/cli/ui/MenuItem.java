package org.galapagos.common.cli.ui;

import org.galapagos.command.Command;

// 1���� �޴��� ��Ÿ��
public class MenuItem {
	private String title; // �޴� ����(Ÿ��Ʋ)
	private Command cmd; // �ش�޴��� ������ ���

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
