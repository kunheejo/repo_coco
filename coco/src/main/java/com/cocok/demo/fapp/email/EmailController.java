package com.cocok.demo.fapp.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cocok.demo.fapp.email.EmailDto;
import com.cocok.demo.fapp.email.EmailService;

@Controller
public class EmailController {
	@Autowired
	EmailService emailService;
	@RequestMapping(value = "/email/emailXdmList")
	public String emailXdmList(Model model) {
		 model.addAttribute("list",emailService.selectList());
		return "/email/emailXdmList";
	}
	
	@RequestMapping(value = "/email/emailXdmView")
	public String phoneXdmView(Model model, EmailDto emailDto) {
		
		System.out.println("emailDto.getSeq(): "+ emailDto.getSeq());
		 model.addAttribute("item",emailService.selectOne(emailDto));
		return "/email/emailXdmView";
	}
}
