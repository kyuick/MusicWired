package com.icia.musicwired.dto;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;
@Builder 
@Data
@Alias("music1")
public class CrawlingDTO {
	 private String muSinger;
	 private String muName;
	 private String muLyric;
	public String getMuSinger() {
		return muSinger;
	}
	public void setMuSinger(String muSinger) {
		this.muSinger = muSinger;
	}
	public String getMuName() {
		return muName;
	}
	public void setMuName(String muName) {
		this.muName = muName;
	}
	public String getMuLyric() {
		return muLyric;
	}
	public void setMuLyric(String muLyric) {
		this.muLyric = muLyric;
	}
	 
	 
}
