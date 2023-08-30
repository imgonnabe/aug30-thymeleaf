package com.qorlwn.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.qorlwn.web.dto.LoginDTO;

@Mapper
public interface LoginDAO {

	LoginDTO login(LoginDTO dto);

}
