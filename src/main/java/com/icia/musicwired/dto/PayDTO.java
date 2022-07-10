package com.icia.musicwired.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("Pay")
public class PayDTO {

	private int pMuCode;
	private String pbMid;
	private String psMid;
	public int getpMuCode() {
		return pMuCode;
	}
	public void setpMuCode(int pMuCode) {
		this.pMuCode = pMuCode;
	}
	public String getPbMid() {
		return pbMid;
	}
	public void setPbMid(String pbMid) {
		this.pbMid = pbMid;
	}
	public String getPsMid() {
		return psMid;
	}
	public void setPsMid(String psMid) {
		this.psMid = psMid;
	}
	
	
}
