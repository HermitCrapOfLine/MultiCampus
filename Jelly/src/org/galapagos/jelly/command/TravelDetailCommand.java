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
			System.out.println("잘못된 번호입니다.");
		}
		// 권역: xxxx
		System.out.println("권역: " + travel.getRegion());

		// 관광지명: xxxxx
		System.out.println("관광지명: " + travel.getTitle());

		// 주소 : xxxx
		System.out.println("주소: " + travel.getAddress());

		// 전화번호 : xxxx
		System.out.println("전화번호: " + travel.getPhone());

		System.out.println(travel.getDescription().replace(". ", ".\n"));

	}

}
