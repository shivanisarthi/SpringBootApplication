package com.example.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

@SpringBootTest
class SpringBootApiApplicationTests {

	@Test
	void apiMethod(){
		Date ObjectOfDate= new Date();
		SpringBootApiApplication springObject = new SpringBootApiApplication();
		DateFormat time = new SimpleDateFormat("hh:mm:ss");
		String timeResult= springObject.apiMethod();
		assertEquals(timeResult,"Running time :- "+time.format( ObjectOfDate));
	}

	@Test
	void apiMethodNegative(){
		Date ObjectOfDate= new Date();

		DateFormat time = new SimpleDateFormat("hh:mm:ss");
		String timeResult= String.valueOf(LocalTime.now());
		assertNotEquals(timeResult,"Running time :- "+time.format( ObjectOfDate));

	}

}
