package org.galapagos.mcmorning.vo;

public class MemberTest2 {

	public static void main(String[] args) {

		Member m1 = new Member("��", "��", "�ڹ�", "���");
		System.out.println(m1);

		Member m2 = new Member();

		m2.setName("�¹���");
		m2.setPassword("��Q");
		m2.setUserid("ȣ����");
		m2.setEmail("�����");

		System.out.println(m2.getName());
		System.out.println(m2.getPassword());
		System.out.println(m2.getUserid());
		System.out.println(m2.getEmail());

	}

}
