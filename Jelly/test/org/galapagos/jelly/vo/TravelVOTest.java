package org.galapagos.jelly.vo;

class TravelVOTest {

	public static void main(String[] args) {
		TravelVO travel = TravelVO.builder().address("서울 특별시").region("수도권").title("멀티 캠퍼스").phone("010-1234-5678")
				.no(1).build();

		System.out.println(travel);
	}

}
