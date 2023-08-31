package com.qorlwn.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qorlwn.web.dto.BoardDTO;
import com.qorlwn.web.dao.BoardDAO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO boardDAO;

	public List<BoardDTO> list(int pageNo) {
		return boardDAO.list(pageNo);
	}

	public BoardDTO detail(int bno) {
		return boardDAO.detail(bno);
	}
	
}
