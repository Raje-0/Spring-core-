package com.SpringCore.rajeClick;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/rajeClick/rajeclickconfig.xml");
		RajeClick client = (RajeClick) context.getBean("client");

		System.out.println(client.getNum());
		System.out.println(client.getName());
		System.out.println(client.getAddress());
	}
}
