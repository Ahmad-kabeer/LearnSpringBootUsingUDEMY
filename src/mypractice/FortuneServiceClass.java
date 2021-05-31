package mypractice;

import java.util.Random;

public class FortuneServiceClass implements FortuneService {

	@Override
	public String getFortune() {
		String arr[]= {"hey", "hi", "woohooo"};
		
		int idx = new Random().nextInt(arr.length);
		String random = (arr[idx]);
		
		return random;
	}

}
