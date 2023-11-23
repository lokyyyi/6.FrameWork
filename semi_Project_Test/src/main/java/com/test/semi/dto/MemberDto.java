package com.test.semi.dto;

public class MemberDto {

	private int mNo;
	private String mName;
	private String mId;
	private String mPassword;
	private String mNickname;
	
	public MemberDto() {
		super();
	}
	
	public MemberDto(int mNo, String mName, String mId, String mPassword, String mNickname) {
		this.mNo = mNo;
		this.mName = mName;
		this.mId = mId;
		this.mPassword = mPassword;
		this.mNickname = mNickname;
	
	}
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}
	public String getmNickname() {
		return mNickname;
	}
	public void setmNickname(String mNickname) {
		this.mNickname = mNickname;
	}
}
