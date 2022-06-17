package com.icia.musicwired.service;

import com.icia.musicwired.dto.MusicCommentDTO;

import java.util.List;

public interface MusicCommentService {
    List<MusicCommentDTO> mcList(int mcCode);
    List<MusicCommentDTO> mcWrite(MusicCommentDTO mcomm);

    List<MusicCommentDTO> mcModify(MusicCommentDTO mcomm);
    List<MusicCommentDTO> mcDelete(MusicCommentDTO mcomm);
}
