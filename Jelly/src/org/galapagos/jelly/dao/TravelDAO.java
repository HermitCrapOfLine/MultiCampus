package org.galapagos.jelly.dao;

import java.util.List;

import org.galapagos.jelly.vo.PageRequest;
import org.galapagos.jelly.vo.Region;
import org.galapagos.jelly.vo.TravelVO;

public interface TravelDAO {
	// ��ü ������ �Ǽ� ���
	int getTotalCount();

	// ������ ��� ���
	List<TravelVO> getPage(PageRequest pageRequest);

	// �ǿ� ��� ���
	List<Region> getRegions();

	// ���� �ǿ��� ������ ��� ���
	List<TravelVO> getSpots(String region);

	List<TravelVO> search(String keyword);

	TravelVO findById(int no);

}
