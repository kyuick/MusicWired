package com.icia.musicwired.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.icia.musicwired.dto.uploadDto;

@Mapper
public interface ChartDAO {

	

	List<uploadDto> hitChart();

	List<uploadDto> likeChart();

	List<uploadDto> balgenre();

}
