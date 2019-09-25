package practice;

import java.util.Scanner;

public class returnPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			collatzFunction();
		} while (again());
	}
	static void collatzFunction() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter a number to get Collatzed: ");
		int n = sc.nextInt();
		int counter = 0;
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
		System.out.println("It took " + counter + " iterations to reach 1.");
	}
	static boolean again() {
		Scanner sc = new Scanner(System.in);
		String yes = "yes";
		boolean ans;
		System.out.print("Enter another number? (Yes/No): ");
		String answer = sc.nextLine();
			if (answer.equals(yes)) {
				ans = true;
			} else {
				ans = false;
			}
		return ans;
	}		
}
