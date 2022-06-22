package com.icia.musicwired.dto;

import org.apache.ibatis.type.Alias;

@Alias("paging")
public class pagingDto {
	private int page; //현재 페이지
	private int startRow; //현재 페이지의 시작행
	private int endRow;	//현재 페이지의 마지막 행
	private int maxPage; // 리스트 행의 총 갯수
	private int startPage; //시작페이지 
	private int endPage; //마지막 페이지
	private int limit; //한페이지의 행의 갯수
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "pagingDto [page=" + page + ", startRow=" + startRow + ", endRow=" + endRow + ", maxPage=" + maxPage
				+ ", startPage=" + startPage + ", endPage=" + endPage + ", limit=" + limit + "]";
	}
	
	
}
