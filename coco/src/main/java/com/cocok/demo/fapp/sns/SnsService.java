package com.cocok.demo.fapp.sns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SnsService {
	@Autowired
	SnsDao snsdao;
	public List<SnsDto> selectList(){
		return snsdao.selectList();
	}
	public SnsDto selectOne(SnsDto snsDto) {
		return snsdao.selectOne(snsDto);
	}
	public int insert(SnsDto snsDto) {
		return snsdao.insert(snsDto);
	}
	public int update(SnsDto snsDto) {
		return snsdao.update(snsDto);
	}
	public int delete(SnsDto snsDto) {
		return snsdao.delete(snsDto);
	}
}
