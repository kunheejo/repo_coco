package com.cocok.demo.fapp.addressbook;

import java.lang.annotation.Repeatable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cocok.demo.fapp.addressbook.AddressbookDto;
 

@Controller
public class AddressbookController {

	@Autowired
	AddressbookService addressbookService;
	
	@RequestMapping(value = "/addressbook/addressbookXdmList")
	public String addressbookXdmList(Model model ) {
		model.addAttribute("list",addressbookService.selectList());
		return "/addressbook/addressbookXdmList";
	}
	
	@RequestMapping(value = "/addressbook/addressbookXdmView")
	public String addressbookXdmView(Model model, AddressbookDto addressbookDto) { 
		 model.addAttribute("item",addressbookService.selectOne(addressbookDto));
		return "/addressbook/addressbookXdmView";
	}
	
	
	@RequestMapping(value = "/addressbook/addressbookXdmForm")
	public String addressbookXdmForm( ) {
	
		return "/addressbook/addressbookXdmForm";
	}
	
	@RequestMapping(value = "/addressbook/addressbookXdmInst")
	public String addressbookXdmInst(AddressbookDto addressbookDto) {
	
		System.out.println("addressbookDto.getSeq(): " + addressbookDto.getSeq());
		 
		
		addressbookService.insert(addressbookDto);
		
		System.out.println("addressbookDto.getSeq(): " + addressbookDto.getSeq());
		return "redirect:/addressbook/addressbookXdmList";
	}
}
