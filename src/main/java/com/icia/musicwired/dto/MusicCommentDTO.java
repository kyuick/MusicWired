package com.icia.musicwired.dto;


import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Date;


@Data
@Alias("mucomment")
public class MusicCommentDTO {


	/*
	 * MCCODE NUMBER , MCMID NVARCHAR2(20) NOT NULL, MCMUNUM NUMBER NOT NULL,
	 * MCCONTENT NVARCHAR2(200) NOT NULL, MCDATE DATE NOT NULL
	 */


	private int mcCode;
	private String mcMid;
	private int mcMuNum;
	private String mcContent;
	private Date mcDate;
	private String mProfileName;
	public int getMcCode() {
		return mcCode;
	}
	public void setMcCode(int mcCode) {
		this.mcCode = mcCode;
	}
	public String getMcMid() {
		return mcMid;
	}
	public void setMcMid(String mcMid) {
		this.mcMid = mcMid;
	}
	public int getMcMuNum() {
		return mcMuNum;
	}
	public void setMcMuNum(int mcMuNum) {
		this.mcMuNum = mcMuNum;
	}
	public String getMcContent() {
		return mcContent;
	}
	public void setMcContent(String mcContent) {
		this.mcContent = mcContent;
	}
	public Date getMcDate() {
		return mcDate;
	}
	public void setMcDate(Date mcDate) {
		this.mcDate = mcDate;
	}
	public String getmProfileName() {
		return mProfileName;
	}
	public void setmProfileName(String mProfileName) {
		this.mProfileName = mProfileName;
	}
	
	
}
