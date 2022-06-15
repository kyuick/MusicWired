package com.icia.musicwired.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.icia.musicwired.dto.MusicCommentDTO;
@Mapper
public interface MusicCommentDAO {

	List<MusicCommentDTO> mcList(int mcCode);

	int mcWrite(MusicCommentDTO mcomm);

	int mcModify(MusicCommentDTO mcomm);

	int mcDelete(MusicCommentDTO mcomm);

}
