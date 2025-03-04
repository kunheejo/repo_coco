package com.cocok.demo.fapp.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhoneController {

	@Autowired
	PhoneService phoneService;
	@RequestMapping(value = "/phone/phoneXdmList")
	public String phoneXdmList(Model model) {
		 model.addAttribute("list",phoneService.selectList());
		return "/phone/phoneXdmList";
	}
	
	@RequestMapping(value = "/phone/phoneXdmView")
	public String phoneXdmView(Model model, PhoneDto phoneDto) {
		
		System.out.println("phoneDto.getSeq(): "+ phoneDto.getSeq());
		 model.addAttribute("item",phoneService.selectOne(phoneDto));
		return "/phone/phoneXdmView";
	}
}