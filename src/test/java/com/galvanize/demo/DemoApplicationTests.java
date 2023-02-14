package com.galvanize.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void returnNumberShouldReturnOne(){
		DemoApplication demoApplication = new DemoApplication();
		assertEquals(1, demoApplication.returnNumber());
	}

}
