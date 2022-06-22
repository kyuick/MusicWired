package com.icia.musicwired.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dto.MusicLikeDto;
import com.icia.musicwired.dto.uploadDto;

public interface uploadService {
	ModelAndView fileUpload(uploadDto dto) throws IOException;

	ModelAndView fileList(int page, int limit);

	ModelAndView muView(int muCode);

	//수정페이지이동
	ModelAndView fileModiForm(int muCode);

	//수정메소드
	ModelAndView fileModify(uploadDto dto) throws IOException;


	ModelAndView fileDelete(int muCode);

	void muCount(int muCode);

	///////////////////////////////////////////////////////
	//좋아요 +1
	List<uploadDto> LikeUp(int muCode);

	//좋아요 테이블에 추가
	List<MusicLikeDto> LikeUpInsert(MusicLikeDto mlDto);

	///////////////////////////////////////////////////////


	//좋아요 -1
	List<uploadDto> LikeDown(int muCode);
	//좋아요 테이블에서 삭제
	List<MusicLikeDto> LikeDelete(MusicLikeDto mlDto);


	ModelAndView muLikeList(int page, int limit, int muCode);

	
}
