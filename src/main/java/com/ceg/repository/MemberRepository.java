package com.ceg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceg.entity.Member;


public interface MemberRepository extends JpaRepository <Member, Long>{
	
}
