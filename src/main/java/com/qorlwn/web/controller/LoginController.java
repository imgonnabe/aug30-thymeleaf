package com.qorlwn.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.qorlwn.web.dto.LoginDTO;
import com.qorlwn.web.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public RedirectView login(LoginDTO dto, HttpSession session) {
		System.out.println(dto.toString());
		LoginDTO result = loginService.login(dto);
		System.out.println(result.toString());
		if(result != null && result.getCount() == 1) {
			session.setAttribute("m_id", result.getM_id());
			session.setAttribute("m_name", result.getM_name());
			return new RedirectView("/");
		} else {
			return new RedirectView("/login");
		}
	}
}
