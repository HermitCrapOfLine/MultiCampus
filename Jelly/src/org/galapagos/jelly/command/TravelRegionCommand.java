package org.galapagos.jelly.command;

import java.util.List;

import org.galapagos.common.cli.Input;
import org.galapagos.common.command.Command;
import org.galapagos.jelly.dao.TravelDAO;
import org.galapagos.jelly.dao.TravelMySQLDaoImp1;
import org.galapagos.jelly.utils.TravelUtil;
import org.galapagos.jelly.vo.Region;
import org.galapagos.jelly.vo.TravelVO;

public class TravelRegionCommand implements Command {
	TravelDAO dao = TravelMySQLDaoImp1.getInstance();

	@Override
	public void execute() {
		// �ǿ� ����Ʈ�� ���
		// 1) ������ (13)
		// 2) ���� (14)
		// ...
		// 6) ���ֱ�(44)
		// ����: 2 --> ���� ����
		// ���� ��� ���� ���

		List<Region> regions = dao.getRegions();

//		for (int i = 0; i < regions.size(); i++) {
//			Region r = regions.get(i);
//			System.out.printf("%d) %s\n", i + 1, r);
//		}
//		int sel = Input.readInt("�ǿ� ����: ");
//
//		String region = regions.get(sel - 1).getRegion();

		Region region = Input.<Region>select("�ǿ� ����: ", regions);
		List<TravelVO> list = dao.getSpots(region.getRegion());

		TravelUtil.printTravelList(list);
		// �� xxx ��( ���� ������ ��ȣ / �� ��������)
		System.out.printf("(�� %d ��)", list.size());

	}

}
