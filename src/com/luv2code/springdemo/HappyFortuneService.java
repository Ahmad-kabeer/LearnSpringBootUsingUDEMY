package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneServices {

	@Override
	public String getDailyFortunes() {
		return "Be happy with your fortune";
	}

}
