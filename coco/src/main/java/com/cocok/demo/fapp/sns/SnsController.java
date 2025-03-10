package com.cocok.demo.fapp.sns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cocok.demo.fapp.homepage.HomepageDto;

@Controller
public class SnsController {
	
	@Autowired
	SnsService snsService;
	
	@RequestMapping(value = "/sns/snsXdmList")
	public String snsXdmList(Model model) {
		model.addAttribute("list",snsService.selectList());
		return "/sns/snsXdmList";
	}
	
	@RequestMapping(value = "/sns/snsXdmView")
	public String snsXdmView(Model model, SnsDto snsDto) { 
		 model.addAttribute("item",snsService.selectOne(snsDto));
		return "/sns/snsXdmView";
	}
	
	@RequestMapping(value = "/sns/snsXdmForm")
	public String snsXdmForm( ) {
	
		return "/sns/snsXdmForm";
	}
	
	
	
	@RequestMapping(value = "/sns/snsXdmInst")
	public String snsXdmInst(SnsDto snsDto) {
	
		System.out.println("snsDto.getSeq(): " + snsDto.getSeq());
		 
		
		snsService.insert(snsDto);
		
		System.out.println("snsDto.getSeq(): " + snsDto.getSeq());
		return "redirect:/sns/snsXdmList";
	}
	
	@RequestMapping(value = "/sns/snsXdmMfom")
	public String snsXdmMfom(Model model,SnsDto snsDto) {
		
		 model.addAttribute("item",snsService.selectOne(snsDto));
//		 System.out.println("addressDto.getSeq():" + addressDto.getSeq());
		return "/sns/snsXdmMfom";
	}
	
	@RequestMapping(value = "/sns/snsXdmUpdt")
	public String snsXdmUpdt(SnsDto snsDto) {
		snsService.update(snsDto);
		return "redirect:/sns/snsXdmList";
	}
	
	@RequestMapping(value = "/sns/snsXdmDele")
	public String snsXdmDele(SnsDto snsDto) {
		snsService.delete(snsDto);
		return "redirect:/sns/snsXdmList";
	}
	
	@RequestMapping(value = "/sns/snsXdmUele")
	public String snsXdmUele(SnsDto snsDto) {
		snsService.delete(snsDto);
		return "redirect:/sns/snsXdmList";
	}
	
}
