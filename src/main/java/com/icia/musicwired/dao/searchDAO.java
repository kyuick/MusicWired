package com.icia.musicwired.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.icia.musicwired.dto.pagingDto;
import com.icia.musicwired.dto.serchDTO;
import com.icia.musicwired.dto.uploadDto;

@Mapper
public interface searchDAO {

	List<uploadDto> search(String keyword);

	List<uploadDto> search1(String keyword);

	int search2(String keyword);

	int search3(String keyword);

	List<uploadDto> songSearch(pagingDto paging);

	List<uploadDto> singerSearch(pagingDto paging);

	int searchInsert(String keyword);

	List<serchDTO> searchRank();

	

}
