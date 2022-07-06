package com.icia.musicwired.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dao.searchDAO;
import com.icia.musicwired.dto.uploadDto;


@Service
public class searchServiceImpl implements searchService {

	@Autowired
	private searchDAO dao;
	
	@Override
	public ModelAndView search(String keyword) {
		
	    ModelAndView mav= new ModelAndView();
		
		System.out.println("검색 키워드 s :"+keyword);
		
		
		List<uploadDto>searchList=dao.search(keyword);
		List<uploadDto>singerList=dao.search1(keyword);

		int nCount=dao.search2(keyword);
		int sCount=dao.search3(keyword);
		
		mav.addObject("nCount",nCount);
		mav.addObject("sCount",sCount);
		mav.addObject("search",searchList);
		mav.addObject("singerList",singerList);
		mav.setViewName("Search");
		
		return mav;
	}
}


	
	

