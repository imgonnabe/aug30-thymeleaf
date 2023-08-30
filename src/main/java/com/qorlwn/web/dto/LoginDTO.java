package com.qorlwn.web.dto;

import lombok.Data;

@Data
public class LoginDTO {
	private String m_id, m_name, m_pw;
	private int count;
}
