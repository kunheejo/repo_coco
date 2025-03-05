package com.cocok.demo.fapp.addressbook;

import java.util.List;

import org.springframework.stereotype.Repository;

 

@Repository
public interface AddressbookDao {
	public List<AddressbookDto> selectList();
	public AddressbookDto selectOne(AddressbookDto addressbookDto);
	public int insert(AddressbookDto addressbookDto);
}
