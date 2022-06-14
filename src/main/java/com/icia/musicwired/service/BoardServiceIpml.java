package com.icia.musicwired.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.icia.musicwired.dao.BoardDAO;
import com.icia.musicwired.dto.BoardDTO;
import com.icia.musicwired.dto.BoardLikeDTO;

@Service
public class BoardServiceIpml implements BoardService{
private ModelAndView mav = new ModelAndView();
	
	@Autowired
	private BoardDAO bodao;
	
	List<BoardDTO> boardList = new ArrayList<BoardDTO>();
	
	List<BoardLikeDTO> boardLike = new ArrayList<BoardLikeDTO>();
	
//	boardUpload : 게시글 업로드 메소드
	@Override
	public ModelAndView boardUpload(BoardDTO board) throws IllegalStateException, IOException {
		System.out.println("[2] 업로드 S : " + board);
		// 1.파일 불러오기
		MultipartFile boImageFile = board.getBoImageFile();

		// 2.파일 이름 불러오기
		String originalFileName = boImageFile.getOriginalFilename();

		// 3.난수(UUID) 생성하기 (랜덤으로 생성한 문자열 중 0~8 번째 index값만 가지고 오도록 지정)
		String uuid = UUID.randomUUID().toString().substring(0, 8);

		// 4. 파일이름 지정 (3번 + 2번)
		String boImage = uuid + "_" + originalFileName;

		// 5. 파일 저장 위치 설정 (상대경로 사용)
		Path path = Paths.get(System.getProperty("user.dir"), "src/main/resources/static/ImageUpload");
		String savePath = path + "/" + boImage;

		// 6. 파일 선택 여부
		if (!boImageFile.isEmpty()) {
			board.setBoImage(boImage);
			boImageFile.transferTo(new File(savePath));
		}
		
		int result = bodao.boardUpload(board);

		System.out.println("[3] 업로드 S : " + result);
		if (result > 0) {
			mav.setViewName("index");
		} else {
			mav.setViewName("index");
		}

		return mav;
	}

//	boardList : 게시글 목록 메소드
	@Override
	public ModelAndView boardList() {
		
		List<BoardDTO> boardList = bodao.boardList();
		
		mav.setViewName("board_list");
		mav.addObject("boardList",boardList);
		
		return mav;
	}

//	boardModiForm : 게시글 수정 페이지 이동
	@Override
	public ModelAndView boardModiForm(int boCode) {
		
		BoardDTO board = bodao.boardModiView(boCode);
		
		mav.setViewName("board_ModiForm");
		mav.addObject("modi",board);
		
		return mav;
	}
	
//	boardModify : 게시글 수정 메소드
	@Override
	public ModelAndView boardModify(BoardDTO board) throws IllegalStateException, IOException {
		System.out.println("[2] 수정 S : " + board);
		// 1.파일 불러오기
		MultipartFile boImageFile = board.getBoImageFile();

		// 2.파일 이름 불러오기
		String originalFileName = boImageFile.getOriginalFilename();

		// 3.난수(UUID) 생성하기 (랜덤으로 생성한 문자열 중 0~8 번째 index값만 가지고 오도록 지정)
		String uuid = UUID.randomUUID().toString().substring(0, 8);

		// 4. 파일이름 지정 (3번 + 2번)
		String boImage = uuid + "_" + originalFileName;

		// 5. 파일 저장 위치 설정 (상대경로 사용)
		Path path = Paths.get(System.getProperty("user.dir"), "src/main/resources/static/ImageUpload");
		String savePath = path + "/" + boImage;

		// 6. 파일 선택 여부
		if (!boImageFile.isEmpty()) {
			board.setBoImage(boImage);
			boImageFile.transferTo(new File(savePath));
		}
		
		int result = bodao.boardModify(board);

		System.out.println("[3] 수정 S : " + result);
		if (result > 0) {
			mav.setViewName("redirect:/boardList");
		} else {
			mav.setViewName("index");
		}

		return mav;
	}
	
//	boardDelete : 게시글 삭제 메소드
	@Override
	public ModelAndView boardDelete(int boCode) {
		System.out.println("[2] 삭제 S : " + boCode);
		int result = bodao.boardDelete(boCode);
		System.out.println("[3] 삭제 S : " + result);
		if(result > 0) {
			mav.setViewName("redirect:/boardList");
		} else {
			mav.setViewName("index");
		}
		
		return mav;
	}

//	ajaxBoardList : 게시글 목록 메소드(ajax)
	@Override
	public List<BoardDTO> ajaxBoardList() {
		
		boardList = bodao.ajaxBoardList();
		
		return boardList;
	}

//	boLikeUp : 좋아요 증가 메소드(ajax)
	@Override
	public List<BoardDTO> boLikeUp(int boCode) {
		
		System.out.println("[2] 좋아요증가 S : " + boCode);
		
		int result = bodao.boLikeUp(boCode);
		
		System.out.println("[3] 좋아요증가 S : " + result);
		
		if(result > 0) {
			boardList = bodao.ajaxBoardListSelect(boCode);
		} else {
			boardList = null;
		}
		
		return boardList;
	}

//	boLikeDown : 좋아요 감소 메소드(ajax)
	@Override
	public List<BoardDTO> boLikeDown(int boCode) {
		System.out.println("[2] 좋아요감소 S : " + boCode);
		int result = bodao.boLikeDown(boCode);
		System.out.println("[3] 좋아요감소 S : " + result);
		if(result > 0) {
			boardList = bodao.ajaxBoardListSelect(boCode);
		} else {
			boardList = null;
		}
		
		return boardList;
	}

//	boLikeInsert : 좋아요 테이블 등록 메소드(ajax)
	@Override
	public List<BoardLikeDTO> boLikeInsert(BoardLikeDTO boLike) {
		System.out.println("[2] 좋아요 테이블 등록 S : " + boLike);
		
		int result = bodao.boLikeInsert(boLike);
		System.out.println("[3] 좋아요 테이블 등록 S : " + result);
		
		if(result>0) {
			
		} else {
			boardLike = null;
		}
		return boardLike;
	}

//	boLikeCheck : 좋아요한 게시글 목록 불러오기 메소드(ajax)
	@Override
	public List<BoardLikeDTO> boLikeCheck(BoardLikeDTO boLike) {
		System.out.println("[2] 좋아요 게시글 목록 불러오기 S : " + boLike);
		
		List<BoardLikeDTO> boLikeList = bodao.boLikeCheck(boLike);
		
		if(boLikeList != null) {
			boardLike = boLikeList;
		} else {
			boardLike = null;
		}
		
		System.out.println("[3] 좋아요 게시글 목록 불러오기 S : " + boLikeList);
		return boardLike;
	}

//	boLikeDelete : 좋아요 테이블 삭제 메소드(ajax)
	@Override
	public List<BoardLikeDTO> boLikeDelete(BoardLikeDTO boLike) {
		System.out.println("[2] 좋아요 테이블 삭제 S : " + boLike);
		
		int result = bodao.boLikeDelete(boLike);
		System.out.println("[3] 좋아요 테이블 삭제 S : " + result);
		
		if(result>0) {
			
		}else {
			boardLike = null;
		}
		
		return boardLike;
	}

//	ajaxBoardSelect : 게시글 제목으로 검색 메소드(ajax)
	@Override
	public List<BoardDTO> ajaxBoardSelect(String boTitle) {
		System.out.println("[2] 게시글 제목검색 S : " + boTitle);
		List<BoardDTO> board = bodao.ajaxBoardSelect(boTitle);
		
		boardList = board;
		
		System.out.println("[3] 게시글 제목검색 S : " + boTitle);
		return boardList;
	}





}
