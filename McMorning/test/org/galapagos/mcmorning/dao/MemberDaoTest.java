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
		MemberDao dao = new MemberDao();
		List<Member> list = dao.getMemberList();

		Member m2 = new Member("dooli", "1234", "둘리", "dooli@naver.com");
		dao.add(m2);

		for (Member m : list) {
			System.out.println(m);
		}
	}

	static void testAdd() {
		MemberDao dao = new MemberDao();
		List<Member> list = dao.getMemberList();

		int l = list.size();

		Member m2 = new Member("dooli", "1234", "둘리", "dooli@gmail.com");
		dao.add(m2);

		assert list.size() == l + 1 : "추가실패";
	}

	static void testFindByUserid() {
		MemberDao dao = new MemberDao();

		String userid = "hong";
		Member m = dao.findByUserid(userid);

		assert m != null && userid.equals(m.getUserid()) : userid + " 검색 실패";

		userid = "donut";
		m = dao.findByUserid(userid);
		assert m == null : userid + " 검색 실패";

	}

	static void testUpdate() {
		MemberDao dao = new MemberDao();

		Member m = new Member("id2", "8345", "나개똥", "하나포스");
		Member m2 = dao.update(m);
		assert m2 != null && m == m2 : "업데이트 실패";

	}

	static void testDelete() {
		MemberDao dao = new MemberDao();

		Member m = dao.delete("id4");

		assert m != null && m.getUserid().equals("id4") : "삭제 실패";

	}
}
