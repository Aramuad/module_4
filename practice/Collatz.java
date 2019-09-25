package practice;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Collatz {

	public static void main(String[] args) {
		try {
			collatzFunction();	
		} catch (InputMismatchException e) {
			System.out.print("That's not a number...");
			Collatz.main(args);	
		}
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
		again();
	}
	static void again() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter another number? (Yes/No): ");
		String choice = sc.nextLine().trim().toLowerCase();
		String yes = "yes";
		String no = "no";
			if (choice.equals(yes) || choice.equals(no)) {
				if (choice.equals(yes)) {
					collatzFunction();
				} else if (choice.equals(no)) {
					System.exit(0);
				}
			} else {
				System.out.print("Not a valid entry...");
				again();
			}
	}
}
