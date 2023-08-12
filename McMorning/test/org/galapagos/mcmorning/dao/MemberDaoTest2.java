package org.galapagos.mcmorning.dao;

import java.util.List;

import org.galapagos.mcmorning.vo.Member1;

public class MemberDaoTest2 {

	public static void main(String[] args) {
		testRead();
		testAdd();
		testFindByUserid();
		testUpdate();
		testDelete();
	}

	private static void testDelete() {
		// TODO Auto-generated method stub

	}

	private static void testUpdate() {
		// TODO Auto-generated method stub

	}

	private static void testFindByUserid() {
		// TODO Auto-generated method stub

	}

	private static void testAdd() {
		MemberDao1 dao = new MemberDao1();
		List<Member1> list = dao.getMemberList();

		int l = list.size();

		Member1 m2 = new Member1("id6", "1234", "길동", "야후");
		dao.add(m2);

		assert list.size() == l + 1 : "추가실패";
	}

	private static void testRead() {
		MemberDao1 dao = new MemberDao1();
		List<Member1> list = dao.getMemberList();

		Member1 m2 = new Member1("id5", "5555", "승민", "파란");
		dao.add(m2);

		for (Member1 x : list) {
			System.out.println(x);
		}
	}

}
