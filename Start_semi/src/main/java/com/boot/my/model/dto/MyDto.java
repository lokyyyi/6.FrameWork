package com.boot.my.model.dto;

import java.util.Date;

public class MyDto {
	private int bid;
	private String btitle;
	private String bcontent;
	private Date bdate;
	private String bimg;

	public MyDto() {
		super();
	}

	public MyDto(int bid, String btitle, String bcontent, Date bdate, String bimg) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bimg = bimg;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String getBimg() {
		return bimg;
	}

	public void setBimg(String bimg) {
		this.bimg = bimg;
	}
	
	

}
