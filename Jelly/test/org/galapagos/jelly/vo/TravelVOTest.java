package org.galapagos.jelly.vo;

class TravelVOTest {

	public static void main(String[] args) {
		TravelVO travel = TravelVO.builder().address("���� Ư����").region("������").title("��Ƽ ķ�۽�").phone("010-1234-5678")
				.no(1).build();

		System.out.println(travel);
	}

}
