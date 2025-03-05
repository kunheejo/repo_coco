package com.cocok.demo.fapp.anniversary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocok.demo.fapp.email.EmailDao;
import com.cocok.demo.fapp.email.EmailDto;

@Service
public class AnniversaryService {

	@Autowired
	AnniversaryDao anniversaryDao;
	
//	public List<CompanyDto> selectList(){
//		 List<CompanyDto> companyDtos = new ArrayList<>();
//		 
//		 companyDtos = companyDao.selectList();
//		 
//		return companyDtos;
//	}
//	
	public List<AnniversaryDto> selectList(){
		return anniversaryDao.selectList();
	}
	
	public AnniversaryDto selectOne(AnniversaryDto anniversaryDto){
		return anniversaryDao.selectOne(anniversaryDto);
	}
	
	public int insert(AnniversaryDto anniversaryDto){
		return anniversaryDao.insert(anniversaryDto);
	}
}
