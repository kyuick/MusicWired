package com.icia.musicwired.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dto.BoardDTO;
import com.icia.musicwired.dto.serchDTO;
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
	
	//테스트 
	@GetMapping("/test")
	public ModelAndView test(@ModelAttribute serchDTO search) {
		
		ModelAndView mav= new ModelAndView();
		
		mav=ssvc.test(search);
		
		return mav;
	}

	
	
	//음악 제목 검색 더보기
	@GetMapping("/songSearch")
	public ModelAndView songSearch(@RequestParam(value="page",required=false,defaultValue="1")int page,
								   @RequestParam(value="limit",required=false,defaultValue="10")int limit,	
									@RequestParam("keyword")String keyword) {
		ModelAndView mav= new ModelAndView();
		
		System.out.println("음악 제목 검색 c : "+keyword);
		
		System.out.println("page c"+page);
		System.out.println("limit c"+limit);
		
		mav=ssvc.songSearch(keyword,page,limit);
		
		System.out.println("제목검색 mav c : "+mav);
		
		return mav;
	}
	
	//음악 가수 검색 더보기
		@GetMapping("/singerSearch")
		public ModelAndView singerSearch(@RequestParam(value="page",required=false,defaultValue="1")int page,
				   @RequestParam(value="limit",required=false,defaultValue="10")int limit,	
					@RequestParam("keyword")String keyword) {
			ModelAndView mav= new ModelAndView();
			
			System.out.println("음악 제목 검색 c : "+keyword);
			
			mav=ssvc.singerSearch(keyword,page,limit);
			
			return mav;
		}
		
	
	
	
	
}
