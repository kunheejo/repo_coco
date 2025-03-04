package com.cocok.demo.fapp.email;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocok.demo.fapp.email.EmailDao;
import com.cocok.demo.fapp.email.EmailDto;

@Service
public class EmailService {
	@Autowired
	EmailDao emailDao;
	
//	public List<CompanyDto> selectList(){
//		 List<CompanyDto> companyDtos = new ArrayList<>();
//		 
//		 companyDtos = companyDao.selectList();
//		 
//		return companyDtos;
//	}
//	
	public List<EmailDto> selectList(){
		  
		return emailDao.selectList();
	}
	
	public EmailDto selectOne(EmailDto emailDto){
		  
		return emailDao.selectOne(emailDto);
	}
}
