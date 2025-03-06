package com.cocok.demo.fapp.homepage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cocok.demo.fapp.address.AddressDto;

@Controller 
public class HomepageController {

	@Autowired
	HomepageService homepageService;
	
	@RequestMapping(value = "/homepage/homepageXdmList")
	public String addressXdmList(Model model ) {
		model.addAttribute("list",homepageService.selectList());
		return "/homepage/homepageXdmList";
	}
	
	@RequestMapping(value = "/homepage/homepageXdmView")
	public String homepageXdmView(Model model, HomepageDto homepageDto) { 
		 model.addAttribute("item",homepageService.selectOne(homepageDto));
		return "/homepage/homepageXdmView";
	}
	
	@RequestMapping(value = "/homepage/homepageXdmForm")
	public String homepageXdmForm( ) {
	
		return "/homepage/homepageXdmForm";
	}
	
	
	
	@RequestMapping(value = "/homepage/homepageXdmInst")
	public String homepageXdmInst(HomepageDto homepageDto) {
	
		System.out.println("homepageDto.getSeq(): " + homepageDto.getSeq());
		 
		
		homepageService.insert(homepageDto);
		
		System.out.println("homepageDto.getSeq(): " + homepageDto.getSeq());
		return "redirect:/homepage/homepageXdmList";
	}
	
	@RequestMapping(value = "/homepage/homepageXdmMfom")
	public String homepageXdmMfom(Model model,HomepageDto homepageDto) {
		
		 model.addAttribute("item",homepageService.selectOne(homepageDto));
//		 System.out.println("addressDto.getSeq():" + addressDto.getSeq());
		return "/homepage/homepageXdmMfom";
	}
	
	@RequestMapping(value = "/homepage/homepageXdmUpdt")
	public String homepageXdmvUpdt(HomepageDto homepageDto) {
		homepageService.update(homepageDto);
		return "redirect:/homepage/homepageXdmList";
	}
}
