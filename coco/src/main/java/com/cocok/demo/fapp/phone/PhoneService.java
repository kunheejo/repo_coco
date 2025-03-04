package com.cocok.demo.fapp.phone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocok.demo.fapp.phone.PhoneDao;
import com.cocok.demo.fapp.phone.PhoneDto;
@Service
public class PhoneService {

	
	@Autowired
	PhoneDao phoneDao;
	
//	public List<CompanyDto> selectList(){
//		 List<CompanyDto> companyDtos = new ArrayList<>();
//		 
//		 companyDtos = companyDao.selectList();
//		 
//		return companyDtos;
//	}
//	
	public List<PhoneDto> selectList(){
		  
		return phoneDao.selectList();
	}
	
	public PhoneDto selectOne(){
		  
		return phoneDao.selectOne();
	}
}
