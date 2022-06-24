package com.icia.musicwired.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("MusicPlayList")
public class MusicPlayListDto {
//    PLCODE NUMBER,
//    PLMUCODE NUMBER NOT NULL,
//    PLMID NVARCHAR2(20) NOT NULL

    private int plCode;
    private int plmuCode;
    private String plMid;

}
