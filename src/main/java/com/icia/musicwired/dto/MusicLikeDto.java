package com.icia.musicwired.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("mulike")
@Data
public class MusicLikeDto {
    private int mulCode;
    private int mulmuCode;  //음악코드
    private String mulMid;  //아이디코드
	public int getMulCode() {
		return mulCode;
	}
	public void setMulCode(int mulCode) {
		this.mulCode = mulCode;
	}
	public int getMulmuCode() {
		return mulmuCode;
	}
	public void setMulmuCode(int mulmuCode) {
		this.mulmuCode = mulmuCode;
	}
	public String getMulMid() {
		return mulMid;
	}
	public void setMulMid(String mulMid) {
		this.mulMid = mulMid;
	}
    
    
}
