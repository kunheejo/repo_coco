package com.cocok.demo.fapp.homepage;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cocok.demo.fapp.homepage.HomepageDto;

@Repository
public interface HomepageDao {
	public List<HomepageDto> selectList();
	public HomepageDto selectOne(HomepageDto addressDto);
	public int insert(HomepageDto homepageDto);
	public int update(HomepageDto homepageDto);
	
}
