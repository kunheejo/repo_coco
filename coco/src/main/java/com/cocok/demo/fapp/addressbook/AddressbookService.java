package com.cocok.demo.fapp.addressbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cocok.demo.fapp.addressbook.AddressbookDao;
import com.cocok.demo.fapp.addressbook.AddressbookDto;

@Service
public class AddressbookService {
	@Autowired
	AddressbookDao addressbookDao;
	
//	public List<CompanyDto> selectList(){
//		 List<CompanyDto> companyDtos = new ArrayList<>();
//		 
//		 companyDtos = companyDao.selectList();
//		 
//		return companyDtos;
//	}
//	
	public List<AddressbookDto> selectList(){
		return addressbookDao.selectList();
	}
	
	public AddressbookDto selectOne(AddressbookDto addressbookDto){
		return addressbookDao.selectOne(addressbookDto);
	}
	
	public int insert(AddressbookDto addressbookDto){
		return addressbookDao.insert(addressbookDto);
	}
	public int update(AddressbookDto addressbookDto){
		return addressbookDao.update(addressbookDto);
	}
}
