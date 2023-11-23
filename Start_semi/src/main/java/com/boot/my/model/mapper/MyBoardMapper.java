package com.boot.my.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.boot.my.model.dto.MyDto;

@Mapper
public interface MyBoardMapper {

	@Select(" SELECT * FROM MULTIBOARD ORDER BY BID DESC ")
	List<MyDto> selectList();
	
//	@Insert(" INSERT ..... ")
//	int insert(int myno);
}
