package com.icia.musicwired.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dto.uploadDto;
import com.icia.musicwired.service.ChartService;

@Controller
public class ChartController {

	private ModelAndView mav= new ModelAndView();
	
	@Autowired 
	private ChartService csv;
	//hitChart
	@RequestMapping(value="/chart", method = RequestMethod.GET)
	public String chart() {
		return "Chart";
	}
	
	
	List<uploadDto> hitChart  = new ArrayList<uploadDto>();
	List<uploadDto> GenreChart  = new ArrayList<uploadDto>();
	
	@RequestMapping(value="/hitChart", method = RequestMethod.POST)
	public @ResponseBody List<uploadDto> hitChart(){
		System.out.println("hit11");
		hitChart = csv.hitChart();
		
		System.out.println("hit!! : "+hitChart);
		
		return hitChart;
	}
	
	@RequestMapping(value="/likeChart", method = RequestMethod.POST)
	public @ResponseBody List<uploadDto> likeChart(){
		System.out.println("컨트롤러 likeChart ");
		hitChart = csv.likeChart();
		
		System.out.println("like!!! : "+hitChart);
		
		return hitChart;
	}
	
	//장르 페이지 이동
	@RequestMapping(value="/genre", method = RequestMethod.GET)
	public String genre() {
		return "Genre";
	}
	
	@RequestMapping(value="/balGenre", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> GenreChart(@RequestParam(value="page", required = false, defaultValue = "1")int page,
		@RequestParam(value="limit", required = false, defaultValue = "10")int limit) {
		 Map<String, Object> result = new HashMap<String, Object>();


		System.out.println("컨트롤러 발라드 장르 이동");
	
		result=csv.balgenre(page,limit);//페이지 ,장르
		System.out.println("컨트롤러 페이지 "+result); 
		
		return result;
	}
	
	@RequestMapping(value="/danceGenre", method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object>danceGenre(@RequestParam(value="page", required = false, defaultValue = "1")int page,
			@RequestParam(value="limit", required = false, defaultValue = "10")int limit) {
		 Map<String, Object> result = new HashMap<String, Object>();
			System.out.println("컨트롤러 락 장르 이동");
			
			result=csv.danceGenre(page,limit);//페이지 ,장르
			System.out.println("컨트롤러 페이지 "+result); 
			
			return result;
}
	
	@RequestMapping(value="/rockGenre", method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object>rockGenre(@RequestParam(value="page", required = false, defaultValue = "1")int page,
			@RequestParam(value="limit", required = false, defaultValue = "10")int limit) {
		 Map<String, Object> result = new HashMap<String, Object>();
			System.out.println("컨트롤러 힙합 장르 이동");
			
			result=csv.rockGenre(page,limit);//페이지 ,장르
			System.out.println("컨트롤러 페이지 "+result); 
			
			return result;
}
	
	@RequestMapping(value="/hiphopGenre", method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object>hiphopGenre(@RequestParam(value="page", required = false, defaultValue = "1")int page,
			@RequestParam(value="limit", required = false, defaultValue = "10")int limit) {
		 Map<String, Object> result = new HashMap<String, Object>();
			System.out.println("컨트롤러 인디 장르 이동");
			
			result=csv.hiphopGenre(page,limit);//페이지 ,장르
			System.out.println("컨트롤러 페이지 "+result); 
			
			return result;
}
	
	@RequestMapping(value="/indiGenre", method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object>indiGenre(@RequestParam(value="page", required = false, defaultValue = "1")int page,
			@RequestParam(value="limit", required = false, defaultValue = "10")int limit) {
		 Map<String, Object> result = new HashMap<String, Object>();
			System.out.println("컨트롤러 댄스 장르 이동");
			
			result=csv.indiGenre(page,limit);//페이지 ,장르
			System.out.println("컨트롤러 페이지 "+result); 
			
			return result;
}
	
	@RequestMapping(value="/gitaGenre", method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object>gitaGenre(@RequestParam(value="page", required = false, defaultValue = "1")int page,
			@RequestParam(value="limit", required = false, defaultValue = "10")int limit) {
		 Map<String, Object> result = new HashMap<String, Object>();
			System.out.println("컨트롤러 댄스 장르 이동");
			
			result=csv.gitaGenre(page,limit);//페이지 ,장르
			System.out.println("컨트롤러 페이지 "+result); 
			
			return result;
}
	
}
	
	


