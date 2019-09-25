package lab_7;
import java.util.Scanner;
import java.lang.Math;
public class SumEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		while (!stop) {
			sumNums();
			System.out.print("Enter another number? (Yes/No): ");
			String answer = sc.nextLine().trim().toLowerCase();
				if (answer.equals("no")) {
					stop = true;
				}
		}
	}
	private static void sumNums() {
		Scanner sc = new Scanner(System.in);
		String answer;
		System.out.println();
		System.out.print("Enter a number between 20 and 60: ");
		int n = sc.nextInt();
		if (n < 20 || n > 60 || n % 2 == 1) {
			System.out.println("Not a valid entry!");
			sumNums();
		} else {
				while(n >= 20 && n <= 60 && n % 2 == 0) {
					evaluator(n);
					break;
				}
		}
	}
	private static void evaluator(int n) {
		int i;
		int c = 0;
		for(i = 0; i <= n; i += 2) {
			c = c + i;
		}
		System.out.println();
		System.out.println("Entered value: " + n);
		System.out.println("Sum of even numbers between 2 and " + n + " is " + c);
		System.out.println();
	}
}
