package com.icia.musicwired.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dto.BoardDTO;
import com.icia.musicwired.dto.BoardLikeDTO;

public interface BoardService {

	ModelAndView boardUpload(BoardDTO board) throws IllegalStateException, IOException;

	ModelAndView boardList();

	ModelAndView boardModiForm(int boCode);

	List<BoardDTO> ajaxBoardList();

	List<BoardDTO> boLikeUp(int boCode);

	List<BoardDTO> boLikeDown(int boCode);

	ModelAndView boardModify(BoardDTO board) throws IllegalStateException, IOException;

	ModelAndView boardDelete(int boCode);

	List<BoardLikeDTO> boLikeInsert(BoardLikeDTO boLike);

}
