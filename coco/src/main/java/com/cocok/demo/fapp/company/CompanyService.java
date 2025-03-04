package com.cocok.demo.fapp.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

	 //로직을정의 하는 부분
	
	//여러건의 데이터를 가지고 온다
	
	@Autowired
	CompanyDao companyDao;
	
//	public List<CompanyDto> selectList(){
//		 List<CompanyDto> companyDtos = new ArrayList<>();
//		 
//		 companyDtos = companyDao.selectList();
//		   
//		return companyDtos;
//	}
//	
	public List<CompanyDto> selectList(){
		  
		return companyDao.selectList();
	}
}
