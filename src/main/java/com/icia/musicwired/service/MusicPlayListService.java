package com.icia.musicwired.service;

import com.icia.musicwired.dto.MusicPlayListDto;
import com.icia.musicwired.dto.uploadDto;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface MusicPlayListService {
    List<MusicPlayListDto> playList(MusicPlayListDto mpDto);

//    ModelAndView playListView(String mId);

    // 리스트 출력
    List<MusicPlayListDto> playListPrint(String mId);

    //플레이리스트 검색
    List<uploadDto> playListSearch(String muName);


}
