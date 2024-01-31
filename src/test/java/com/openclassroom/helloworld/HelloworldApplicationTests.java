package com.openclassroom.helloworld;

import com.openclassroom.helloworld.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloworldApplicationTests {
	@Autowired
	private BusinessService bs;
	@Test
	void contextLoads() {
	}

	@Test
	public void testGetHelloWorld(){
		assertEquals(bs.getHelloWorld().getValue(),"Hello World");
	}

}
