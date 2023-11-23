package com.test.semi.dao;

import java.util.List;

import com.test.semi.dto.BoardDto;

public interface BoardDao {
	
	public List<BoardDto> selectList();
	public BoardDto selectOne(int myno);
	public int insert(BoardDto dto);
	public int update(BoardDto dto);
	public int delete(int myno);
}
