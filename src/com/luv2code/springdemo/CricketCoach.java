package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneServices  fsi;	
	
	private String email;
	private String name;
	
	
	
	public CricketCoach() {
		System.out.println("hello cricket coach class");
		
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setFsi(FortuneServices fsi) {
		System.out.println("inside set injection cricketcoach class");
		this.fsi = fsi;
	}
	

	@Override
	public String getcodingWorkout() {

		return "Practice Fast bowling";
	}

	@Override
	public String getDailyFortunet() {

		return fsi.getDailyFortunes();
	}

}
