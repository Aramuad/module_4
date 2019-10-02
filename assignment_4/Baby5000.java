package assignment_4;
import java.util.Scanner;
public class Baby5000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the principle: ");
		double p = sc.nextDouble();
		System.out.print("Enter the annual addition: ");
		double a = sc.nextDouble();
		System.out.print("Enter the number of years to grow: ");
		int y = sc.nextInt();
		System.out.print("Enter the interest rate as a percentage: ");
		double r = sc.nextDouble();
		
		System.out.println("Year 0: $" + p);
		double[] account = bank(p, a, y, r);
			for(int i = 0; i < account.length; i++) {
				System.out.printf("Year " + (findIndex(account, account[i]) + 1) + ": $%1.2f", account[i]);
				System.out.println();
			}
		System.out.println();
		sc.close();
	}
	
	public static int findIndex(double arr[], double t) {	// findIndex method taken from geeksforgeeks.org
		if(arr == null) {
			return -1;
		} else {
			int len = arr.length;
			int i = 0;
			
			while(i < len) {
				if(arr[i] == t) {
					return i;
				} else {
					i = i + 1;
				}
			}
		}
		return -1;
	}
	
	private static double[] bank(	double principle,
									double annual,
									int years,
									double interest	) {
		
		double[] account = new double[years];
		double holder = interest/100;
		for(int i = 0; i < years; i++) {
			interest =  (principle + annual) * holder;
			principle = principle + annual + interest;
			account[i] = principle;
		}
		return account;
	}
}
