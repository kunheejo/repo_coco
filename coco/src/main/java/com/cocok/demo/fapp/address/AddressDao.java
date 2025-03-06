package com.cocok.demo.fapp.address;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao {
	public List<AddressDto> selectList();
	public AddressDto selectOne(AddressDto addressDto);
	public int insert(AddressDto addressDto);
	public int update(AddressDto addressDto);

}
