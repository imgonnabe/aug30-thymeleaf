package com.qorlwn.web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.qorlwn.web.dto.LoginDTO;
import com.qorlwn.web.service.LoginService;

@SpringBootTest
class Aug30ApplicationTests {
	
	// jUnit = 자바에서 독립된 단위테스트를 지원하는 프레임워크
	// 단정(assert) 메서드로 테스트 케이스의 수행결과를 판별한다.
	// jUnit4 이후부터는 테스트를 지원하는 어노테이션을 제공한다.(@Test, @Before, @After 등)
	// @Test 메서드가 호출할 때마다 새로운 인스턴스를 생성해서 독립적인 테스트가 이루어지게 한다.
	
	@Autowired
	LoginService loginService;
	
	@Test
	@DisplayName("처음하는 테스트")
	void contextLoads() {
		// dto에 값을 담아서 db에 물어보면 값이 오는지
		LoginDTO dto = new LoginDTO();
		dto.setM_id("aaaa");
		dto.setM_pw("1234567");
		LoginDTO result = loginService.login(dto);
		
		assertEquals(result.getM_name(), "떡볶이");
		assertNotNull(result);
		assertSame(dto, result);
	}
}
