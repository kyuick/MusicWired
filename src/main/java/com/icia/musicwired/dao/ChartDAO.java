package com.icia.musicwired.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.icia.musicwired.dto.likecountDTO;
import com.icia.musicwired.dto.pagingDto;
import com.icia.musicwired.dto.uploadDto;

@Mapper
public interface ChartDAO {

	

	List<uploadDto> hitChart();

	List<uploadDto> likeChart();

	int baladCount();

	List<uploadDto> balgenre(pagingDto paging);

	int danceCount();

	List<uploadDto> danceGenre(pagingDto paging);

	int rockCount();

	List<uploadDto> rockGenre(pagingDto paging);

	int hiphopCount();

	List<uploadDto> hiphopGenre(pagingDto paging);

	int indiCount();

	List<uploadDto> indiGenre(pagingDto paging);

	int gitaCount();

	List<uploadDto> gitaGenre(pagingDto paging);

	List<likecountDTO> likecount(pagingDto paging);

	List<likecountDTO> likecount1(pagingDto paging);

	List<likecountDTO> likecount2(pagingDto paging);

	List<likecountDTO> likecount3(pagingDto paging);

	List<likecountDTO> likecount4(pagingDto paging);

	List<likecountDTO> likecount5(pagingDto paging);



	

	

}
