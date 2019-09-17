package lab_6;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;

public class PrintSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			try {
				
				System.out.println();
				System.out.print("Enter a value from 1 - 100 to find sum of all digits: ");
				double value = (int)Math.round(sc.nextDouble());
				if (value < 1 || value > 100) {
					
					System.out.println();
					System.out.print("Enter a valid number!");
					PrintSum.main(args);
					
				} else {
					
					int sum = 0;
					int n = 1;
					while (n <= value) {
						
						sum = sum + n;
						n++;
						
					}
				
				System.out.println();
				System.out.println("You entered: " + (int)value);
				System.out.println("Sum of values: " + sum);
					
				}
				
			} catch (InputMismatchException n) {
				
				System.out.println("Enter a valid number!");
				PrintSum.main(args);
				
			}
				
		System.out.println();
		System.out.print("Enter another number? (Yes/No): ");
		sc.nextLine();
		String choice = sc.nextLine();
		String yes = "yes";
		String no = "no";
		
			if (choice.equals(yes)) {
				
				PrintSum.main(args);
				
			} else if (choice.equals(no)) {
				
				System.exit(0);
				
			}
		
	}

}
