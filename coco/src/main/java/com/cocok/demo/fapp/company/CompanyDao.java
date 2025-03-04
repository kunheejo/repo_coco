package com.cocok.demo.fapp.company;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDao {
 
	
//	mapper에서 해당하는 쿼리를 연걸 시켜주고 
//	쿼리 결과를 가져옴
	
 
	
	
//	추상메서드
	public List<CompanyDto> selectList();
	
}
