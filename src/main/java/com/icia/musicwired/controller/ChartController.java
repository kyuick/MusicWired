package com.icia.musicwired.controller;

import java.util.ArrayList;
import java.util.List;

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
	public @ResponseBody List<uploadDto>balgenre() {
		System.out.println("컨트롤러 발라드 장르 이동");
		
		GenreChart=csv.balgenre();
		
		return GenreChart;
	}
	
}
	
	
	
	


