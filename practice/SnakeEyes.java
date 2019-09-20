package practice;

import java.lang.Math;

public class SnakeEyes {

	public static void main(String[] args) {

		double roll1, roll2;
		int rolls = 0;
		
		do {
			
			roll1 = Math.floor(Math.random()*6)+1;
			roll2 = Math.floor(Math.random()*6)+1;
			rolls++;
	
		} while (roll1 != 1 || roll2 != 1);
		
		System.out.println("Number of rolls: " + rolls);
		System.out.println("Roll 1: " + (int)roll1);
		System.out.println("Roll 2: " + (int)roll2);
			
	}
}