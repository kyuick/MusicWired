package com.icia.musicwired.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.icia.musicwired.dto.uploadDto;

@Mapper
public interface searchDAO {

	List<uploadDto> search(String keyword);

	List<uploadDto> search1(String keyword);

	int search2(String keyword);

	int search3(String keyword);

	

}
