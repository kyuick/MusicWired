package com.icia.musicwired.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("BoardLike")
public class BoardLikeDTO {

	private int bolCode;
	private int bolBoCode;
	private String bolMid;
	public int getBolCode() {
		return bolCode;
	}
	public void setBolCode(int bolCode) {
		this.bolCode = bolCode;
	}
	public int getBolBoCode() {
		return bolBoCode;
	}
	public void setBolBoCode(int bolBoCode) {
		this.bolBoCode = bolBoCode;
	}
	public String getBolMid() {
		return bolMid;
	}
	public void setBolMid(String bolMid) {
		this.bolMid = bolMid;
	}

	
}
