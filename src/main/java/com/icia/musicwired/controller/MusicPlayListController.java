package com.icia.musicwired.controller;

import com.icia.musicwired.dto.BoCommentDTO;
import com.icia.musicwired.dto.MusicPlayListDto;
import com.icia.musicwired.service.MusicPlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MusicPlayListController {
    @Autowired
    private MusicPlayListService mpsvc;
    List<MusicPlayListDto> playList = new ArrayList<MusicPlayListDto>();

    private ModelAndView mav = new ModelAndView();
    //playList : playList 테이블에 insert
    @RequestMapping(value="playList", method= RequestMethod.POST)
    public @ResponseBody List<MusicPlayListDto> bcList(@ModelAttribute MusicPlayListDto mpDto){

        playList = mpsvc.playList(mpDto);
        return playList;
    }
    //playListView : 재생목록 조회 페이지
    @GetMapping("/playListView")
    public ModelAndView playListView(@RequestParam ("mId") String mId) {
        System.out.println("1"+mId);
        mav = mpsvc.playListView(mId);
        System.out.println("5"+mav);
        return mav;
    }
}
