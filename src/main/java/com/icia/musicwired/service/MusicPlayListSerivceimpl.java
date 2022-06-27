package com.icia.musicwired.service;

import com.icia.musicwired.dao.MusicPlayListDao;
import com.icia.musicwired.dto.MusicPlayListDto;
import com.icia.musicwired.dto.pagingDto;
import com.icia.musicwired.dto.uploadDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicPlayListSerivceimpl implements MusicPlayListService{

    @Autowired
    private MusicPlayListDao mpDao;
    List<MusicPlayListDto> playList = new ArrayList<MusicPlayListDto>();
    private ModelAndView mav = new ModelAndView();

    @Override
    public List<MusicPlayListDto> playList(MusicPlayListDto mpDto) {

        int result = mpDao.playList(mpDto);

        if(result>0) {

        }
        return playList;
    }

//    @Override
//    public ModelAndView playListView(String mId) {
//        System.out.println("2"+mId);
//        List<MusicPlayListDto> playListView = mpDao.playListView(mId);
//        System.out.println("4"+playListView);
//        mav.setViewName("play_List");
//        mav.addObject("list",playListView);
//        return mav;
//    }

    // playList : 리스트 출력
    @Override
    public List<MusicPlayListDto> playListPrint(String mId) {

        List<MusicPlayListDto>playListPrint = mpDao.playListPrint(mId);

        return playListPrint;
    }

    @Override
    public List<uploadDto> playListSearch(String muName) {
        List<uploadDto> playListSearch = mpDao.playListSearch(muName);

        return playListSearch;
    }




}
