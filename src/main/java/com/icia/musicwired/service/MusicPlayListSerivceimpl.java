package com.icia.musicwired.service;

import com.icia.musicwired.dao.MusicPlayListDao;
import com.icia.musicwired.dto.MusicPlayListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicPlayListSerivceimpl implements MusicPlayListService{

    @Autowired
    private MusicPlayListDao mpDao;
    List<MusicPlayListDto> playList = new ArrayList<MusicPlayListDto>();

    @Override
    public List<MusicPlayListDto> playList(MusicPlayListDto mpDto) {

        int result = mpDao.playList(mpDto);

        if(result>0) {

        }
        return playList;
    }
}
