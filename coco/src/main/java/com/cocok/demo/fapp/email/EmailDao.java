package com.cocok.demo.fapp.email;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cocok.demo.fapp.email.EmailDto;
import com.cocok.demo.fapp.email.EmailDto;

@Repository
public interface EmailDao {
	public List<EmailDto> selectList();
	public EmailDto selectOne(EmailDto emailDto);
	public int insert(EmailDto emailDto);
}
