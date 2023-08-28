package org.galapagos.jelly.command;

import java.util.List;

import org.galapagos.common.cli.Input;
import org.galapagos.common.command.Command;
import org.galapagos.jelly.dao.TravelDAO;
import org.galapagos.jelly.dao.TravelMySQLDaoImp1;
import org.galapagos.jelly.utils.TravelUtil;
import org.galapagos.jelly.vo.PageRequest;
import org.galapagos.jelly.vo.TravelVO;

public class TravelListCommand implements Command {
	final static int COUNT_PER_PAGE = 10;
	TravelDAO dao = TravelMySQLDaoImp1.getInstance();

	@Override
	public void execute() {

		while (true) {
			// ������ ���� [1~12]: 3
			int totalCount = dao.getTotalCount();
			int totalPage = (int) Math.ceil(totalCount / (double) COUNT_PER_PAGE);
			String title = String.format("������ ���� [1~%d]: ", totalPage);
			int page = Input.readInt(title);
			if (page == 0) {
				return;
			}
			// page 1: 1
			// page 2: 11
			// page 3: 21

			// ����Ŭ
//			int start = (page - 1) * COUNT_PER_PAGE + 1;

			// mySQL
			int start = (page - 1) * COUNT_PER_PAGE;
			PageRequest pageRequest = new PageRequest(start, COUNT_PER_PAGE);
			List<TravelVO> list = dao.getPage(pageRequest);

//			int end = start + COUNT_PER_PAGE - 1;

			TravelUtil.printTravelList(list);
			// �� xxx ��( ���� ������ ��ȣ / �� ��������)
			System.out.printf("�� %d ��(%d/%d)", totalCount, page, totalPage);
		}
	}

}
