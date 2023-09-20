package com.student.service;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ImportResource("beans.xml")
public class StudentServiceTest {
	
	private ApplicationContext context;
	private StudentService service;

	@BeforeEach
	void setUp() {
		context = new ClassPathXmlApplicationContext("beans.xml");  
		service =  context.getBean("studentService", StudentService.class);
	}
	
 
	@Test
	void testGetOneStudent() {
		assertThat(service, notNullValue());
	}
	
	@Test
	void tesGetAll() {
		 
	}
}
