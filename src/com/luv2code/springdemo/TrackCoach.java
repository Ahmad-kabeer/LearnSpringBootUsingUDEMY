package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach,DisposableBean{
	
	private FortuneServices fsinterface;

	public TrackCoach(FortuneServices fs) {
		
		fsinterface = fs;
	}

	@Override
	public String getcodingWorkout() {
		
		return "Run 15 key on you finger over keyboard";
		
	}

	@Override
	public String getDailyFortunet() {

		return fsinterface.getDailyFortunes();
		
	}
	
	public void initmethod() {
		System.out.println("hiiiiiiiiiiiii");
	}
	
	public void endmethod() {
		System.out.println("bye");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
		
	}

}
