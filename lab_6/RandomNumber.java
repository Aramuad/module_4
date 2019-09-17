package lab_6;

import java.lang.Math;

public class RandomNumber {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			
			System.out.println(i + ": " + Math.round(Math.random() * 50));
			
		}
		
	}

}
