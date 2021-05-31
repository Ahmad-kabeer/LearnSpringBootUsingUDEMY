package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		
		Coach thecoach=context.getBean("myCoach",Coach.class);
		
		Coach alphacoach=context.getBean("myCoach",Coach.class);
		
		System.out.println(thecoach==alphacoach);

		System.out.println("memeroy location of thecoach="+ thecoach);
		
		System.out.println("memeroy location of alphacoach="+ alphacoach);
		
		
		context.close();

	}

}
