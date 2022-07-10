package com.icia.musicwired.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("chatRoom")
public class CRDTO {
	int crNum;
	String crId;
	String crRead;
	public int getCrNum() {
		return crNum;
	}
	public void setCrNum(int crNum) {
		this.crNum = crNum;
	}
	public String getCrId() {
		return crId;
	}
	public void setCrId(String crId) {
		this.crId = crId;
	}
	public String getCrRead() {
		return crRead;
	}
	public void setCrRead(String crRead) {
		this.crRead = crRead;
	}
	
	

}