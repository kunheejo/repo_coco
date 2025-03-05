package com.cocok.demo.fapp.anniversary;

import java.lang.annotation.Repeatable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cocok.demo.fapp.email.EmailDto;


@Controller
public class AnniversaryContoller {
	
	
	@Autowired
	AnniversaryService anniversaryService;
	
	
	@RequestMapping(value = "/anniversary/anniversaryXdmList")
	public String anniversaryXdmList(Model model ) {
		model.addAttribute("list",anniversaryService.selectList());
		return "/anniversary/anniversaryXdmList";
	}
	
	
	
	@RequestMapping(value = "/anniversary/anniversaryXdmView")
	public String anniversaryXdmView(Model model, AnniversaryDto anniversaryDto) { 
		 model.addAttribute("item",anniversaryService.selectOne(anniversaryDto));
		return "/anniversary/anniversaryXdmView";
	}
	
	
	@RequestMapping(value = "/anniversary/anniversaryXdmForm")
	public String anniversaryXdmForm( ) {
	
		return "/anniversary/anniversaryXdmForm";
	}
	
	@RequestMapping(value = "/anniversary/anniversaryXdmInst")
	public String anniversaryXdmInst(AnniversaryDto anniversaryDto) {
	
		System.out.println("emailDto.getSeq(): " + anniversaryDto.getSeq());
		 
		
		anniversaryService.insert(anniversaryDto);
		
		System.out.println("anniversaryDto.getSeq(): " + anniversaryDto.getSeq());
		return "redirect:/anniversary/anniversaryXdmList";
	}
	

}
