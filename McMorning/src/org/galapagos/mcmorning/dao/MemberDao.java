package org.galapagos.mcmorning.dao;

import java.util.List;

import org.galapagos.mcmorning.vo.Member;

public interface MemberDao {

	List<Member> getMemberList();

	void add(Member m);

	// userid�� ã��
	Member findByUserid(String userid);

	// ����
	Member update(Member m);

	// ����
	Member delete(String userid);

	List<Member> searchByName(String name); // name : ȫ�浿, �浿, ��, �� ..

}