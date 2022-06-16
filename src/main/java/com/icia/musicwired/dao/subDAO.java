package com.icia.musicwired.dao;

import org.apache.ibatis.annotations.Mapper;

import com.icia.musicwired.dto.subDTO;

@Mapper
public interface subDAO {

	int subreg(subDTO sub);

}
