package org.galapagos.mcmorning.dao;

import java.util.ArrayList;
import java.util.List;

import org.galapagos.mcmorning.vo.Member1;

import lombok.Getter;

public class MemberDao1 {

	@Getter
	private List<Member1> memberList;

	public MemberDao1() {
		memberList = new ArrayList<>();
		memberList.add(new Member1("id1", "1111", "김기령", "다음"));
		memberList.add(new Member1("id2", "2222", "손기령", "구글"));
		memberList.add(new Member1("id3", "3333", "박기령", "아마존"));
		memberList.add(new Member1("id4", "4444", "황기령", "네이버"));

	}

	public void add(Member1 m) {
		memberList.add(m);
	}

}
