package com.ceg.service;

import java.util.List;

import com.ceg.entity.Member;

public interface MemberService {

	List<Member> getAllMembers();
	
	Member saveMember(Member member);
	
	Member getMemberById(Long id);
	
	Member updateMember(Member member);
	
	void deleteMemberById(Long id);
}
