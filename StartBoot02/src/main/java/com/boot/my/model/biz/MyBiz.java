package com.boot.my.model.biz;

import java.util.List;

import com.boot.my.model.dto.MyDto;

public interface MyBiz {
	
	public List<MyDto> selectList();
	public MyDto selectOne(int myno);
	public int insert(MyDto dto);
	public int update(MyDto dto);
	public int delete(int myno);
	
}
