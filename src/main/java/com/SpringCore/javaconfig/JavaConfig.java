package com.SpringCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.SpringCore.javaconfig")
public class JavaConfig {

	@Bean
	public Student getStudent() {
//creating a new object
		Student student = new Student();

		return student;

	}
}
