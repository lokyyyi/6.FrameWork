package com.boot.my.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.my.model.dto.MyDto;
import com.boot.my.model.mapper.MyBoardMapper;

@Service
public class MyBizImpl implements MyBiz{

	@Autowired
	private MyBoardMapper myBoardMapper;
	
	@Override
	public List<MyDto> selectList() {
		return myBoardMapper.selectList();
	}

	@Override
	public MyDto selectOne(int myno) {
		return null;
	}

	@Override
	public int insert(MyDto dto) {
		return 0;
	}

	@Override
	public int update(MyDto dto) {
		return 0;
	}

	@Override
	public int delete(int myno) {
		return 0;
	}

}
