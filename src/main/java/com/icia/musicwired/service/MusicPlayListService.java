package com.icia.musicwired.service;

import com.icia.musicwired.dto.MusicPlayListDto;

import java.util.List;

public interface MusicPlayListService {
    List<MusicPlayListDto> playList(MusicPlayListDto mpDto);
}
