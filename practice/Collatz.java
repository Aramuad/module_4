package practice;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Collatz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			do {
				collatzFunction();
			} while (again());
		} catch (InputMismatchException e) {
			System.out.println("Not a valid entry!");
			if (again() == true) {
				collatzFunction();
			} else {
				System.exit(0);
			}
		}
	}
	static void collatzFunction() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter a number to get Collatzed: ");
		int n = sc.nextInt();
		int counter = 0;
			if (n < 0) {
				System.out.println("Not a valid entry!");
				collatzFunction();
			} else {
				while (n > 1) {
					if (n % 2 == 0) {
						n = n / 2;
						counter++;
						System.out.println(n);
					} else {
						n = (3 * n) + 1;
						counter++;
						System.out.println(n);
					}
				}
			}
		System.out.println("It took " + counter + " iterations to reach 1.");
	}
	static boolean again() {
		Scanner sc = new Scanner(System.in);
		String yes = "yes";
		String no = "no";
		boolean ans = true;
		System.out.print("Enter another number? (Yes/No): ");
		String answer = sc.nextLine();
			if (answer.equals(yes)) {
				ans = true;
			} else if (answer.equals(no)) {
				ans = false;
			} else {
				System.out.println("Not a valid entry!");
				again();
			}
		return ans;
	}		
}