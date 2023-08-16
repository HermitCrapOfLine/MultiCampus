package org.galapagos.mcmorning.dao;

import java.util.List;

import org.galapagos.mcmorning.vo.Member;

public class MemberDaoTest {

	public static void main(String[] args) {
		testRead();
		testAdd();
		testFindByUserid();
		testUpdate();
		testDelete();

	}

	static void testRead() {
		MemberDao dao = new MemberListDao();
		List<Member> list = dao.getMemberList();

		Member m2 = new Member("dooli", "1234", "�Ѹ�", "dooli@naver.com");
		dao.add(m2);

		for (Member m : list) {
			System.out.println(m);
		}
	}

	static void testAdd() {
		MemberDao dao = new MemberListDao();
		List<Member> list = dao.getMemberList();

		int l = list.size();

		Member m2 = new Member("dooli", "1234", "�Ѹ�", "dooli@gmail.com");
		dao.add(m2);

		assert list.size() == l + 1 : "�߰�����";
	}

	static void testFindByUserid() {
		MemberDao dao = new MemberListDao();

		String userid = "hong";
		Member m = dao.findByUserid(userid);

		assert m != null && userid.equals(m.getUserid()) : userid + " �˻� ����";

		userid = "donut";
		m = dao.findByUserid(userid);
		assert m == null : userid + " �˻� ����";

	}

	static void testUpdate() {
		MemberDao dao = new MemberListDao();

		Member m = new Member("id2", "8345", "������", "�ϳ�����");
		Member m2 = dao.update(m);
		assert m2 != null && m == m2 : "������Ʈ ����";

	}

	static void testDelete() {
		MemberDao dao = new MemberListDao();

		Member m = dao.delete("id4");

		assert m != null && m.getUserid().equals("id4") : "���� ����";

	}
}
