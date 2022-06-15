package com.icia.musicwired.dto;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("mucomment")
public class MusicCommentDTO {
/*
 MCCODE NUMBER ,
MCMID NVARCHAR2(20) NOT NULL,
MCMUNUM NUMBER NOT NULL,
MCCONTENT NVARCHAR2(200) NOT NULL,
MCDATE DATE NOT NULL
 */
	
	private int mcCode;
	private String mcMid;
	private int mcMuNum;
	private String mcContent;
	private Date mcDate;
}
