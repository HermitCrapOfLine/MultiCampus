package org.galapagos.mcmorning.vo;

public class MemberTest {

	public static void main(String[] args) {
		Member m1 = new Member();
		System.out.println(m1);

		Member m2 = new Member("id", "23423", "������ ��", "���");
		System.out.println(m2);
		System.out.println(m2.getUserid());
		System.out.println(m2.getName());
		System.out.println(m2.getPassword());
		System.out.println(m2.getEmail());

		m2.setEmail("����� ���� ģ����");
		System.out.println(m2.getEmail());

	}

}
