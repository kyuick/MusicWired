package com.icia.musicwired.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.musicwired.dao.subDAO;
import com.icia.musicwired.dto.subDTO;

@Service
public class subServiceImpl implements subService {

	@Autowired
	private subDAO dao;

	List<subDTO> subList = new ArrayList<subDTO>();

	@Override
	public List<subDTO> subreg(subDTO sub) {
		int result = dao.subreg(sub);
		
		if(result > 0) {
			
		}else {
			subList = null;
		}
		return subList;
	}

}
