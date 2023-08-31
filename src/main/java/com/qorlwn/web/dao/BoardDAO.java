package com.qorlwn.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.qorlwn.web.dto.BoardDTO;

@Mapper
public interface BoardDAO {

	List<BoardDTO> list(int pageNo);

	BoardDTO detail(int bno);

}
