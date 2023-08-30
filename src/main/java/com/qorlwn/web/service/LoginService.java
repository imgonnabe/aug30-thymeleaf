package com.qorlwn.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qorlwn.web.dao.LoginDAO;
import com.qorlwn.web.dto.LoginDTO;

@Service
public class LoginService {
	
	@Autowired
	private LoginDAO loginDAO;

	public LoginDTO login(LoginDTO dto) {
		return loginDAO.login(dto);
	}
}
