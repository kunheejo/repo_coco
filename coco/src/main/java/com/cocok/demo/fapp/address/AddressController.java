package com.cocok.demo.fapp.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cocok.demo.fapp.address.AddressDto;
import com.cocok.demo.fapp.address.AddressDto;

@Controller
public class AddressController {

	@Autowired
	AddressService addressService;
	
	
	@RequestMapping(value = "/address/addressXdmList")
	public String addressXdmList(Model model  ) {
		model.addAttribute("list",addressService.selectList());
		return "/address/addressXdmList";
	}
	
	@RequestMapping(value = "/address/addressXdmView")
	public String addressXdmView(Model model, AddressDto addressDto) { 
		 model.addAttribute("item",addressService.selectOne(addressDto));
		return "/address/addressXdmView";
	}
	
	@RequestMapping(value = "/address/addressXdmForm")
	public String addressXdmForm( ) {
	
		return "/address/addressXdmForm";
	}
	
	@RequestMapping(value = "/address/addressXdmInst")
	public String addressXdmInst(AddressDto addressDto) {
	
		System.out.println("addressDto.getSeq(): " + addressDto.getSeq());
		 
		
		addressService.insert(addressDto);
		
		System.out.println("addressDto.getSeq(): " + addressDto.getSeq());
		return "redirect:/address/addressXdmList";
	}
	
	@RequestMapping(value = "/address/addressXdmMfom")
	public String addressXdmMfom(Model model,AddressDto addressDto) {
		
		 model.addAttribute("item",addressService.selectOne(addressDto));
//		 System.out.println("addressDto.getSeq():" + addressDto.getSeq());
		return "/address/addressXdmMfom";
	}
	
	@RequestMapping(value = "/address/addressXdmUpdt")
	public String addressXdmvUpdt(AddressDto addressDto) {
		addressService.update(addressDto);
		return "redirect:/address/addressXdmList";
	}
	
}
