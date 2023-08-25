package org.galapagos.jelly.command;

import org.galapagos.common.cli.Input;
import org.galapagos.common.command.Command;
import org.galapagos.jelly.dao.TravelDAO;
import org.galapagos.jelly.dao.TravelDaoImp1;
import org.galapagos.jelly.vo.TravelVO;

public class TravelDetailCommand implements Command {
	TravelDAO dao = TravelDaoImp1.getInstance();

	@Override
	public void execute() {
		// No: 104
		int no = Input.readInt("No: ");

		TravelVO travel = dao.findById(no);
		if (travel == null) {
			System.out.println("�߸��� ��ȣ�Դϴ�.");
		}
		// �ǿ�: xxxx
		System.out.println("�ǿ�: " + travel.getRegion());

		// ��������: xxxxx
		System.out.println("��������: " + travel.getTitle());

		// �ּ� : xxxx
		System.out.println("�ּ�: " + travel.getAddress());

		// ��ȭ��ȣ : xxxx
		System.out.println("��ȭ��ȣ: " + travel.getPhone());

		System.out.println(travel.getDescription().replace(". ", ".\n"));

	}

}
