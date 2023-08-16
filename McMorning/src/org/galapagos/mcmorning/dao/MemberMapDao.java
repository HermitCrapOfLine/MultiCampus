package org.galapagos.mcmorning.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.galapagos.mcmorning.vo.Member;

public class MemberMapDao implements MemberDao {
	private Map<String, Member> memberMap;

	public MemberMapDao() {
		memberMap = new HashMap<>();
		memberMap.put("hong", new Member("hong", "1234", "홍길동", "hong@naver.com"));
		memberMap.put("go", new Member("go", "1234", "고길동", "go@naver.com"));
		memberMap.put("na", new Member("na", "1234", "나길동", "na@naver.com"));
		memberMap.put("kim", new Member("kim", "1234", "김길동", "kim@naver.com"));

	}

	@Override
	public List<Member> getMemberList() {
		return new ArrayList<>(memberMap.values());
	}

	@Override
	public void add(Member m) {
		memberMap.put(m.getUserid(), m);
	}

	@Override
	public Member findByUserid(String userid) {
		return memberMap.get(userid);
	}

	@Override
	public Member update(Member m) {
		return memberMap.put(m.getUserid(), m);
	}

	@Override
	public Member delete(String userid) {
		return memberMap.remove(userid);
	}

	@Override
	public List<Member> searchByName(String name) {
		List<Member> list = new ArrayList<>();

		for (Member m : memberMap.values()) {
			if (m.getName().contains(name)) {
				list.add(m);
			}
		}

		return list;

	}

}
