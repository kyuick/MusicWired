package com.icia.musicwired.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dto.uploadDto;

public interface ChartService {

	

	List<uploadDto> hitChart();

	List<uploadDto> likeChart();

	List<uploadDto> balgenre();

}
