package com.SpringCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext a = new ClassPathXmlApplicationContext("com/SpringCore/stereotype/stereoconfig.xml");
		Student student = a.getBean("student", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
	}

}
