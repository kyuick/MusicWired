package com.icia.musicwired.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dao.ChartDAO;
import com.icia.musicwired.dto.uploadDto;

@Service
public class ChartServiceImpl implements ChartService{

	private ModelAndView mav=new ModelAndView();
	
	@Autowired
	private ChartDAO dao; 
	

	List<uploadDto> hitChart  = new ArrayList<uploadDto>();
	List<uploadDto> GenreChart  = new ArrayList<uploadDto>();


	@Override
	public List<uploadDto> hitChart() {
		
		hitChart=dao.hitChart();
		
		System.out.println("hit!!서비스 : "+hitChart);
		
		return hitChart;
	}

	@Override
	public List<uploadDto> likeChart() {
		
		hitChart = dao.likeChart();
		
		System.out.println("서비스닷 likeChart"+hitChart);
		
		return hitChart;
	}

	@Override
	public List<uploadDto> balgenre() {
		
		GenreChart=dao.balgenre();
		
		return GenreChart;
	}

	
	
	
}
