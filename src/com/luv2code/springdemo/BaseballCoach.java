package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneServices fsinterface;
	

	public BaseballCoach(FortuneServices hf) {
		fsinterface=hf;
	}
	
	@Override
	public String getcodingWorkout() {
		return "spend 30 min on keyboard";
	}

	@Override
	public String getDailyFortunet() {
		
		return fsinterface.getDailyFortunes();
	}
	
	
	
}
