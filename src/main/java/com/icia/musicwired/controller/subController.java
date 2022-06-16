package com.icia.musicwired.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icia.musicwired.dto.subDTO;
import com.icia.musicwired.service.subService;

@Controller
public class subController {

	@Autowired
	private subService svc;
	List<subDTO> subList = new ArrayList<subDTO>();
	
	
	//팔로우 하기
	@PostMapping("subreg")
	public @ResponseBody List<subDTO> subreg(@ModelAttribute subDTO sub){
		System.out.println(sub);
		
		subList = svc.subreg(sub);
		
		return subList;
		
	}

}
