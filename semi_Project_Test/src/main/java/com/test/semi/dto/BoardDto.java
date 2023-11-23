package com.test.semi.dto;

import java.util.Date;

public class BoardDto {
	private int bId;
	private String bTitle;
	private String bContent;
	private Date bDate;
	private String bImg;

	public BoardDto() {
	}
	
	public BoardDto(int bId, String bTitle, String bContent, Date bDate, String bImg) {
		this.bId = bId;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
		this.bImg = bImg;
	}
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	public String getbImg() {
		return bImg;
	}
	public void setbImg(String bImg) {
		this.bImg = bImg;
	}
	
}
