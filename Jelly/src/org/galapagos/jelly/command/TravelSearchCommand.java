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
		// 검색어:
		// 검색 결과 출력

		String keyword = Input.read("검색어: ");

		List<TravelVO> list = dao.search("%" + keyword + "%");

		// 검색 결과 출력

		TravelUtil.printTravelList(list);
		System.out.printf("총 %d건\n", list.size());

	}

}
