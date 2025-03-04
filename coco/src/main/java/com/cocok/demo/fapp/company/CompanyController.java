package com.cocok.demo.fapp.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompanyController {

	
	
	//입력되는 주소에 매칭되는 html 정보를 정의
	//html로 데이터 전달
	
	@Autowired
	CompanyService companyService;
	
	
//	@RequestMapping(value = "/company/companyXdmList")
//	public String companyXdmList(Model model) {
//		List<CompanyDto> companyDtos = new ArrayList<>();
//		 
//		 companyDtos = companyService.selectList();
//		 
//		 model.addAttribute("list",companyDtos);
//		 
//		return "/company/companyXdmList";
//	}
	
	@RequestMapping(value = "/company/companyXdmList")
	public String companyXdmList(Model model) {
		 
		 model.addAttribute("list",companyService.selectList());
		 
		return "/company/companyXdmList";
	}
	
	
	
}
