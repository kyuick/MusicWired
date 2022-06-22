package com.icia.musicwired.dao;

import java.util.List;

import com.icia.musicwired.dto.MusicLikeDto;
import org.apache.ibatis.annotations.Mapper;

import com.icia.musicwired.dto.MusicLikeDto;
import com.icia.musicwired.dto.pagingDto;
import com.icia.musicwired.dto.uploadDto;

@Mapper
public interface uploadDao {

	
	  int fileUpload(uploadDto dto);
	    
	    List<uploadDto> fileList(pagingDto paging);

		int fileModify(uploadDto dto);

		int fileDelete(int muCode);


	void muCount(uploadDto dto);


		List<uploadDto> LikeList(int muCode);




	uploadDto muView(uploadDto dto);


		int muListCount();


	////////////////////////////////////////////////////////////
		//	좋아요 +1 메소드

		//좋아요 +1
		int LikeUp(int muCode);
		int LikeUpInsert(MusicLikeDto mlDto);
		List<MusicLikeDto> LikeCheck2(MusicLikeDto mlDto);
	////////////////////////////////////////////////////////////


	////////////////////////////////////////////////////////////
		//좋아요 -1 메소드

		//좋아요 -1
		int LikeDown(int muCode);

		//좋아요 테이블 삭제 result
		int LikeDelete(MusicLikeDto mlDto);
		//좋아요 테이블 삭제
		List<MusicLikeDto> LikeDeleteCheck(MusicLikeDto mlDto);


	////////////////////////////////////////////////////////////
		//좋아요 리스트
		List<MusicLikeDto> MusicLikeList(pagingDto paging);
		// 좋아요 수 카운트
		int MusicLikeCount();


		List<MusicLikeDto> mlList(int muCode);

		List<MusicLikeDto> LikeMid(int muCode);

		List<uploadDto> boardWriterView(String boWriter);

//		List<MusicLikeDto> LikeListCount(int muCode);

////////////////////////////////////////////////////////////
	//	좋아요 +1 메소드

	//좋아요 +1
	int LikeUp(MusicLikeDto musicLikeDto);

	int LikeTableUpCheck(MusicLikeDto musicLikeDto);
////////////////////////////////////////////////////////////


////////////////////////////////////////////////////////////
	//좋아요 -1 메소드

	//좋아요 -1
	int LikeDown(MusicLikeDto musicLikeDto);

	//좋아요 테이블 삭제 result
	int LikeDelete(MusicLikeDto mlDto);
	//좋아요 테이블 삭제



////////////////////////////////////////////////////////////
	//좋아요 리스트
	List<MusicLikeDto> MusicLikeList(pagingDto paging);
	// 좋아요 수 카운트
	int MusicLikeCount();


	List<MusicLikeDto> mlList(int muCode);



	String LikeCheck(uploadDto dto);

	int LikeListCount(uploadDto dto);

	int LikeTableDownCheck(MusicLikeDto musicLikeDto);

//	MemberDTO memberView(uploadDto uploadDto);

//	List<MusicLikeDto> LikeMid(uploadDto uploadDto);

//	List<MusicLikeDto> LikeListCount(int );

//	List<MusicLikeDto> LikeListCount(int muCode);

}
