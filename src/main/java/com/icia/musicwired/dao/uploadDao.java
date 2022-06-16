package com.icia.musicwired.dao;

import java.util.List;

import com.icia.musicwired.dto.MusicLikeDto;
import org.apache.ibatis.annotations.Mapper;

import com.icia.musicwired.dto.pagingDto;
import com.icia.musicwired.dto.uploadDto;

@Mapper
public interface uploadDao {
	
    int fileUpload(uploadDto dto);
    
    List<uploadDto> fileList(pagingDto paging);

	int fileModify(uploadDto dto);

	int fileDelete(int muCode);

	void muCount(int muCode);

	List<uploadDto> LikeList(int muCode);



	uploadDto muView(int muCode);

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
//	int LikeDelete(MusicLikeDto mlDto);
//	//좋아요 테이블 삭제
//	List<MusicLikeDto> LikeDeleteCheck(MusicLikeDto mlDto);

	int LikeDelete(MusicLikeDto mlDto);

	List<MusicLikeDto> LikeDeleteCheck(MusicLikeDto mlDto);
////////////////////////////////////////////////////////////
}
