package com.icia.musicwired.service;

import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dto.serchDTO;



public interface searchService {

	ModelAndView search(String keyword);

	ModelAndView songSearch(String keyword,int page,int limit);

	ModelAndView singerSearch(String keyword,int page,int limit);

	ModelAndView test(serchDTO search); //테스트

}
