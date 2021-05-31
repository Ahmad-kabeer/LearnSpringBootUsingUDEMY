package com.luv2code.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Setterinjection {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach thecoach=context.getBean("cricketcoachclass",CricketCoach.class);
		
		System.out.println(thecoach.getcodingWorkout());
		System.out.println(thecoach.getDailyFortunet());
		
		System.out.println(thecoach.getEmail());
		System.out.println(thecoach.getName());
		
		context.close();
		
		

	}

}
