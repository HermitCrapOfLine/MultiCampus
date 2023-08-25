package org.galapagos.jelly.dao;

import org.galapagos.jelly.vo.TravelVO;

class TravelDaoImp1Test2 {

	public static void main(String[] args) {
		TravelDAO dao = TravelDaoImp1.getInstance();

		TravelVO travel = dao.findById(10);
		System.out.println(travel);
	}

}
