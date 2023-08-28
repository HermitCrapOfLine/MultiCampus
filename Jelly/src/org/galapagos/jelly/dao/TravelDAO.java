package org.galapagos.jelly.dao;

import java.util.List;

import org.galapagos.jelly.vo.PageRequest;
import org.galapagos.jelly.vo.Region;
import org.galapagos.jelly.vo.TravelVO;

public interface TravelDAO {
	// 전체 데이터 건수 얻기
	int getTotalCount();

	// 페이지 목록 얻기
	List<TravelVO> getPage(PageRequest pageRequest);

	// 권역 목록 얻기
	List<Region> getRegions();

	// 선택 권역의 관광지 목록 얻기
	List<TravelVO> getSpots(String region);

	List<TravelVO> search(String keyword);

	TravelVO findById(int no);

}
