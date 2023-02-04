package com.ceg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ceg.entity.Member;
import com.ceg.service.MemberService;

@Controller
public class MemberController {
	
	private MemberService memberService;

	public MemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}
	
	@GetMapping("/members")
	public String listMembers(Model model) {
		model.addAttribute("members", memberService.getAllMembers());
		return "members";
	}

	@GetMapping("/members/new")
	public String createMemberForm(Model model) {
		Member member = new Member();
		model.addAttribute("member", member);
		return "create_member";
	}
	
	@PostMapping("/members")
	public String saveMember(@ModelAttribute("member") Member member) {
		memberService.saveMember(member);
		return "redirect:/members";
	}
	
	@GetMapping("/members/edit/{id}")
	public String editMemberForm(@PathVariable Long id, Model model) {
		model.addAttribute("member", memberService.getMemberById(id));
		return "edit_member";
	}
	
	
	@PostMapping("/members/{id}")
	public String updateMember(@PathVariable Long id, 
			@ModelAttribute("member") Member member,
			Model model) {
		
		//get members from database by id
		Member existingMember = memberService.getMemberById(id);
		existingMember.setId(id);
		existingMember.setFirstName(member.getFirstName());
		existingMember.setLastName(member.getLastName());
		existingMember.setEmail(member.getEmail());
		existingMember.setFellowship(member.getFellowship());
		existingMember.setCell(member.getCell());
		existingMember.setPosition(member.getPosition());
		existingMember.setDepartment(member.getDepartment());
		existingMember.setRhapsody(member.getRhapsody());
		existingMember.setTithe(member.getTithe());
		existingMember.setOthers(member.getOthers());
		
		
		//save updated student object 
		memberService.updateMember(existingMember);
		return "redirect:/members";
	}
	
	// handler method to handle delete member request
	
		@GetMapping("/members/{id}")
		public String deleteMember(@PathVariable Long id) {
		memberService.deleteMemberById(id);
		return "redirect:/members";
		
	}
	
		@GetMapping("/login")
		public String login() {
			return "login";
		}
		
		@GetMapping("/index")
		public String home() {
			return "index";
		}
		
		@GetMapping("/logout")
		public String logout() {
			return "login";
		}
}
