package com.cocok.demo.fapp.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cocok.demo.fapp.address.AddressDao;
import com.cocok.demo.fapp.address.AddressDto;
@Service
public class AddressService {

	@Autowired
	AddressDao addressDao;
	
//	public List<CompanyDto> selectList(){
//		 List<CompanyDto> companyDtos = new ArrayList<>();
//		 
//		 companyDtos = companyDao.selectList();
//		 
//		return companyDtos;
//	}
//	
	public List<AddressDto> selectList(){
		return addressDao.selectList();
	}
	public AddressDto selectOne(AddressDto addressDto) {
		return addressDao.selectOne(addressDto);
	}
	public int insert(AddressDto addressDto) {
		return addressDao.insert(addressDto);
	}
	public int update(AddressDto addressDto) {
		return addressDao.update(addressDto);
	}
	
}
