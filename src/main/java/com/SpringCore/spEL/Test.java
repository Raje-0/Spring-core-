package com.SpringCore.spEL;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext obj = new ClassPathXmlApplicationContext("com/SpringCore/spEL/spELconfig.xml");

		Demo d1 = obj.getBean("demo", Demo.class);

		System.out.println(d1);

		SpelExpressionParser temp = new SpelExpressionParser();
		org.springframework.expression.Expression expression = temp.parseExpression("22+44");
		System.out.println(expression.getValue());
	}

}
