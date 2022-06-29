package com.icia.musicwired.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.service.searchService;



@Controller
public class searchController {
	
	@Autowired
	private searchService ssvc;
	
	//검색 페이지로 이동
	@GetMapping("/search")
	public ModelAndView search(@RequestParam("keyword") String keyword) {
		
		ModelAndView mav=new ModelAndView();
		
		System.out.println("확인");
		
		mav=ssvc.search(keyword);
		
		System.out.println("검색 c : "+mav);
		
		return mav;
	}
	
	
	
	
}
