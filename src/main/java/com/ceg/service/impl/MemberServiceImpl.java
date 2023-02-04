package com.ceg.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ceg.entity.Member;
import com.ceg.repository.MemberRepository;
import com.ceg.service.MemberService;


@Service
public class MemberServiceImpl implements MemberService{

	
	private MemberRepository memberRepository;
	
	public MemberServiceImpl(MemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
	}

	@Override
	public List<Member> getAllMembers() {
		
		return memberRepository.findAll();
	}

	@Override
	public Member saveMember(Member member) {
		
		return memberRepository.save(member);
	}

	@Override
	public Member getMemberById(Long id) {
		return memberRepository.findById(id).get();
	}

	@Override
	public Member updateMember(Member member) {
		return memberRepository.save(member);
	}

	@Override
	public void deleteMemberById(Long id) {
	memberRepository.deleteById(id);
		
	}
	
}
	


