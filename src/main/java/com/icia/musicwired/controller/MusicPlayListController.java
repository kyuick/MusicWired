package com.icia.musicwired.controller;

import com.icia.musicwired.dto.BoCommentDTO;
import com.icia.musicwired.dto.BoardDTO;
import com.icia.musicwired.dto.MusicPlayListDto;
import com.icia.musicwired.dto.uploadDto;
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
    List<uploadDto> uploadDto = new ArrayList<>();

    private ModelAndView mav = new ModelAndView();
    //playList : playList 테이블에 insert
    @RequestMapping(value="playList", method= RequestMethod.POST)
    public @ResponseBody List<MusicPlayListDto> bcList(@ModelAttribute MusicPlayListDto mpDto){

        playList = mpsvc.playList(mpDto);
        return playList;
    }

    @RequestMapping(value = "/playListView", method = RequestMethod.GET)
    public String playListView(@RequestParam ("mId") String mId) {

        return "play_List.html";
    }
//    //playListView : 재생목록 조회 페이지
//    @GetMapping("/playListView")
//    public ModelAndView playListView(@RequestParam ("mId") String mId) {
//        System.out.println("1"+mId);
//        mav = mpsvc.playListView(mId);
//        System.out.println("5"+mav);
//        return mav;
//    }

    //playList : 리스트 출력
    @PostMapping("playListPrint")
    public @ResponseBody List<MusicPlayListDto> playListPrint(@RequestParam ("mId")String mId) {

        playList = mpsvc.playListPrint(mId);
        System.out.println("[4] playList : " + playList);
        return playList;
    }


    //playListSearch : 플레이리스트 검색
    @PostMapping("playListSearch")
    public @ResponseBody List<uploadDto> playListSearch(@RequestParam("muName") String muName) {
        System.out.println("[1] 게시글 muName C : " + muName);
        uploadDto = mpsvc.playListSearch(muName);
        System.out.println("[4] 게시글 muName C : " + muName);
        return uploadDto;
    }
}
