package com.qorlwn.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.qorlwn.web.dto.BoardDTO;
import com.qorlwn.web.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public String board(Model model) {
		List<BoardDTO> list = boardService.list();
		model.addAttribute("list", list);
		return "board";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam(name="bno", required = true) int bno, Model model) {
		// System.out.println(dto.getBno());// 파라미터를 BoardDTO dto로 설정하면
		System.out.println(bno);
		BoardDTO result = boardService.detail(bno);
		model.addAttribute("result", result);
		return "detail";
	}
}
