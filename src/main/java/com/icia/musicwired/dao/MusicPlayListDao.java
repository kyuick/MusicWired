package com.icia.musicwired.dao;

import com.icia.musicwired.dto.MusicPlayListDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MusicPlayListDao {

    int playList(MusicPlayListDto mpDto);
}
