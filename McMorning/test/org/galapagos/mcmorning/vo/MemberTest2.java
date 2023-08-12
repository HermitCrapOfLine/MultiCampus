package org.galapagos.mcmorning.vo;

public class MemberTest2 {

	public static void main(String[] args) {

		Member m1 = new Member("³ª", "´Â", "ÀÚ¹Ù", "°í¼ö");
		System.out.println(m1);

		Member m2 = new Member();

		m2.setName("½Â¹ÎÀÌ");
		m2.setPassword("¾î¹«ÄQ");
		m2.setUserid("È£¿ËÀÌ");
		m2.setEmail("°í¼ö³Ä");

		System.out.println(m2.getName());
		System.out.println(m2.getPassword());
		System.out.println(m2.getUserid());
		System.out.println(m2.getEmail());

	}

}
