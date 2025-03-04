package com.cocok.demo.fapp.phone;

import java.util.List;

import com.cocok.demo.fapp.phone.PhoneDto;

public interface PhoneDao {
	public List<PhoneDto> selectList();
	public PhoneDto selectOne(PhoneDto phoneDto);
}
