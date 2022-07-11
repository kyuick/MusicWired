package com.icia.musicwired.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dto.serchDTO;
import com.icia.musicwired.dto.uploadDto;



public interface searchService {

	ModelAndView search(String keyword);

	ModelAndView songSearch(String keyword,int page,int limit);

	ModelAndView singerSearch(String keyword,int page,int limit);

	List<serchDTO> test(); 

	List<uploadDto> search1(String keyword);

	List<uploadDto> search2(String keyword);

}
