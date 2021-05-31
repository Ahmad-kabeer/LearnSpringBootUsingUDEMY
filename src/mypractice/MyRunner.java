package mypractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRunner {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FortuneService fs=context.getBean("practicefortuneserviceclass",FortuneService.class);
		
		System.out.println(fs.getFortune());
		
		context.close();

	}

}
