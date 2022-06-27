package com.icia.musicwired.dao;

import com.icia.musicwired.dto.MusicPlayListDto;
import com.icia.musicwired.dto.uploadDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MusicPlayListDao {

    int playList(MusicPlayListDto mpDto);

//    List<MusicPlayListDto> playListView(String mId);

    //리스트 출력
    List<MusicPlayListDto> playListPrint(String mId);

    List<uploadDto> playListSearch(String muName);


}
