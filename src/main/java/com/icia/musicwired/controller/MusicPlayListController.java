package com.icia.musicwired.controller;

import com.icia.musicwired.dto.BoCommentDTO;
import com.icia.musicwired.dto.MusicPlayListDto;
import com.icia.musicwired.service.MusicPlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MusicPlayListController {
    @Autowired
    private MusicPlayListService mpsvc;
    List<MusicPlayListDto> playList = new ArrayList<MusicPlayListDto>();

    //playList : playList 테이블에 insert
    @RequestMapping(value="playList", method= RequestMethod.POST)
    public @ResponseBody List<MusicPlayListDto> bcList(@ModelAttribute MusicPlayListDto mpDto){

        playList = mpsvc.playList(mpDto);
        return playList;
    }


}
