package practice;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;

public class SecretNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println();
			System.out.print("Guess a number between 1 and 10: ");
			double random = Math.floor(Math.random() * 10) + 1;
			double guess;
				while ((guess = Math.floor(sc.nextDouble())) != random) {
					
					System.out.print("Guess again: ");
					
					if (guess < 1 || guess > 10) {
						
						SecretNumber.main(args);	
					}
				}
				
			if (guess == random) {
				System.out.println();
				System.out.print((int)random + " is correct!");
				System.out.println();
			}
			
		} catch (InputMismatchException e) {
			
			System.out.println();
			System.out.println("Not a valid entry!");
			SecretNumber.main(args);
		}
		
		System.out.println();
		System.out.print("Enter another number? (Yes/No): ");
		sc.nextLine();
		String choice = sc.nextLine().trim().toLowerCase();
		String yes = "yes";
		String no = "no";
		
			if (choice.equals(yes)) {	
				SecretNumber.main(args);	
			} else if (choice.equals(no)) {	
				System.exit(0);
			}
				
	}
					
}
				
