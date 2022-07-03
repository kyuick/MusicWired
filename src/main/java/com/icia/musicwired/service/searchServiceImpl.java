package com.icia.musicwired.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dao.searchDAO;
import com.icia.musicwired.dto.pagingDto;
import com.icia.musicwired.dto.serchDTO;
import com.icia.musicwired.dto.uploadDto;


@Service
public class searchServiceImpl implements searchService {

	@Autowired
	private searchDAO dao;
	
	@Override
	public ModelAndView search(String keyword) {
		
	    ModelAndView mav= new ModelAndView();
		
		System.out.println("검색 키워드 s :"+keyword);
		
		int result=dao.searchInsert(keyword);
		
		System.out.println("검색 db저장 s : "+keyword);
		
		
		List<uploadDto>searchList=dao.search(keyword);
		List<uploadDto>singerList=dao.search1(keyword);

		int nCount=dao.search2(keyword);

		int sCount=dao.search3(keyword);
		
		if(nCount==0 && sCount==0 ) {
			mav.addObject("keyword",keyword);
		//	mav.addObject("searchRank",searchRank);
			mav.setViewName("noSearch");

		}else {
		mav.addObject("keyword",keyword);
		mav.addObject("nCount",nCount);
		mav.addObject("sCount",sCount);
		mav.addObject("search",searchList);
		mav.addObject("singerList",singerList);
	//	mav.addObject("searchRank",searchRank);
		mav.setViewName("Search");
		}
		
		
	
			
			
		return mav;
	}

	@Override
	public ModelAndView songSearch(String keyword,int page, int limit) {
		
		ModelAndView mav=new ModelAndView();
		
		int block = 5;
		
		int nCount=dao.search2(keyword);
		
		int startRow = (page - 1) * limit + 1;
		int endRow = page * limit;

		int maxPage = (int) (Math.ceil((double) nCount/ limit)); // Math.ceil 올림
		int startPage = (((int) (Math.ceil((double) page / block))) - 1) * block + 1;
		int endPage = startPage + block - 1;
		// 오류 방지
		if (endPage > maxPage) {
			endPage = maxPage;

		}
		pagingDto paging = new pagingDto();

		paging.setPage(page);
		paging.setStartRow(startRow);
		paging.setEndRow(endRow);
		paging.setMaxPage(maxPage);
		paging.setStartPage(startPage);
		paging.setEndPage(endPage);
		paging.setLimit(limit);
		paging.setmId(keyword);
		
		System.out.println("페이지 디티오값 :"+paging);
		
		List<uploadDto>searchList=dao.songSearch(paging);
		
		System.out.println("서치리스트 : "+searchList);
		System.out.println("페이징 디티오2 : "+paging);
		
		mav.addObject("nCount",nCount);
		mav.addObject("search",searchList);
		mav.addObject("paging",paging);
		mav.setViewName("songSearch");
		
		return mav;
	}

	@Override
	public ModelAndView singerSearch(String keyword,int page, int limit) {

		ModelAndView mav=new ModelAndView();
		
		int block = 5;
		
		int nCount=dao.search3(keyword);
		
		int startRow = (page - 1) * limit + 1;
		int endRow = page * limit;

		int maxPage = (int) (Math.ceil((double) nCount/ limit)); // Math.ceil 올림
		int startPage = (((int) (Math.ceil((double) page / block))) - 1) * block + 1;
		int endPage = startPage + block - 1;
		// 오류 방지
		if (endPage > maxPage) {
			endPage = maxPage;

		}
		pagingDto paging = new pagingDto();

		paging.setPage(page);
		paging.setStartRow(startRow);
		paging.setEndRow(endRow);
		paging.setMaxPage(maxPage);
		paging.setStartPage(startPage);
		paging.setEndPage(endPage);
		paging.setLimit(limit);
		paging.setmId(keyword);
		
		List<uploadDto>singerList=dao.singerSearch(paging);
		

		mav.addObject("nCount",nCount);
		mav.addObject("singerList",singerList);
		mav.addObject("paging",paging);
		mav.setViewName("singerSearch");
		
		return mav;
	}

		//테스트
	@Override
	public ModelAndView test(serchDTO search) {
		ModelAndView mav = new ModelAndView();
			
		List<serchDTO>searchRank=dao.searchRank();
		
		System.out.println("searchRank s : "+searchRank);
		
		mav.addObject("searchRank",searchRank);
		
		mav.setViewName("Test");
		
		return mav;
	}
}


	
	

