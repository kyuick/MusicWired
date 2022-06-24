package com.icia.musicwired.service;

import com.icia.musicwired.dao.MusicPlayListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicPlayListSerivceimpl implements MusicPlayListService{

    @Autowired
    private MusicPlayListDao mpDao;


}
