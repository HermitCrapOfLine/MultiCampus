package org.galapagos.jelly.command;

import java.util.List;

import org.galapagos.common.cli.Input;
import org.galapagos.common.command.Command;
import org.galapagos.jelly.dao.TravelDAO;
import org.galapagos.jelly.dao.TravelMySQLDaoImp1;
import org.galapagos.jelly.utils.TravelUtil;
import org.galapagos.jelly.vo.TravelVO;

public class TravelSearchCommand implements Command {
	TravelDAO dao = TravelMySQLDaoImp1.getInstance();

	@Override
	public void execute() {
		// �˻���:
		// �˻� ��� ���

		String keyword = Input.read("�˻���: ");

		List<TravelVO> list = dao.search("%" + keyword + "%");

		// �˻� ��� ���

		TravelUtil.printTravelList(list);
		System.out.printf("�� %d��\n", list.size());

	}

}
