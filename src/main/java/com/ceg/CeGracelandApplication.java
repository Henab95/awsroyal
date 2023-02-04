package com.ceg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ceg.entity.Member;
import com.ceg.repository.MemberRepository;

@SpringBootApplication
public class CeGracelandApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CeGracelandApplication.class, args);
	}

	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Member member1 = new Member("Abraham", "Oliha", "abraham@gmail.com", "Light House", "Royal", "Member", "Choir", "25000", "10,000", "Nil");
		memberRepository.save(member1);
		
		Member member2 = new Member("James", "Edward", "jamedw@gmail.com", "Soul Harvesters", "Salvation", "Pastoral Assitant", "Usher", "242,000", "120,000", "35,000");
		memberRepository.save(member2);
		*/
	}

}
