package org.galapagos.mcmorning.dao;

import java.util.ArrayList;
import java.util.List;

import org.galapagos.mcmorning.vo.Member;

import lombok.Getter;

//Member�� ���� CRUD
public class MemberListDao implements MemberDao {
	@Getter
	private List<Member> memberList;

	public MemberListDao() {
		memberList = new ArrayList<Member>();
		memberList.add(new Member("id1", "7345", "�谳��", "����"));
		memberList.add(new Member("id2", "8345", "������", "���̹�"));
		memberList.add(new Member("id3", "9345", "�ڰ���", "����"));
		memberList.add(new Member("id4", "2345", "�̰���", "�Ķ�"));
	}

	@Override
	public void add(Member m) {
		memberList.add(m);
	}

	// userid�� ã��
	@Override
	public Member findByUserid(String userid) {
//		for (Member m : memberList) {
//			if (userid.equals(m.getUserid())) {
//				return m;
//			}
//		}

		int idx = indexOf(userid);

		return idx != -1 ? memberList.get(idx) : null;

	}

	@Override
	public Member update(Member m) {

//		for (int i = 0; i < memberList.size(); i++) {
//			if (m.getUserid().equals(memberList.get(i).getUserid())) {
//				memberList.set(i, m);
//				return m;
//			}
//		}
		int idx = indexOf(m.getUserid());

		if (idx != -1) {
			memberList.set(idx, m);
			return m;
		}

		return null;

	}

	private int indexOf(String userId) {
		for (int i = 0; i < memberList.size(); i++) {
			if (userId.equals(memberList.get(i).getUserid())) {
				return i;
			}
		}
		return -1;
	}

	// ����
	@Override
	public Member delete(String userid) {
		int idx = indexOf(userid);

//		if (idx != -1) {
//			return memberList.remove(idx);
//		}
//		return null;
//	

		return idx != -1 ? memberList.remove(idx) : null;
	}

	@Override
	public List<Member> searchByName(String name) {
		List<Member> list = new ArrayList<>();

		for (Member m : memberList) {
			if (m.getName().contains(name)) { // contains �Ǵ� substring���� �˻縦 �Ѵ�.
				list.add(m);
			}
		}

		return list;

	}
}