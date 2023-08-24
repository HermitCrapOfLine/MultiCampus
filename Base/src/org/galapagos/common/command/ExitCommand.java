package org.galapagos.common.command;

import org.galapagos.common.cli.Input;
import org.galapagos.common.ui.Application;

public class ExitCommand implements Command {
	private Application app;

	public ExitCommand(Application app) {
		super();
		this.app = app;
	}

	@Override
	public void execute() {

		boolean answer = Input.confirm("���� �����ұ��?");

		if (answer) {
			// ���ø����̼��� cleanup ����
			app.cleanup();

			System.out.println("�����մϴ�.");
			System.exit(0);
		}
	}

}
