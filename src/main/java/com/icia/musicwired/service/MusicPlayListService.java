package com.icia.musicwired.service;

import com.icia.musicwired.dto.MusicPlayListDto;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface MusicPlayListService {
    List<MusicPlayListDto> playList(MusicPlayListDto mpDto);

    ModelAndView playListView(String mId);
}
