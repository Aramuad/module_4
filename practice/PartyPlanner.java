package practice;
import java.util.Scanner;
public class PartyPlanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int guests;
		double time, wpercent, bpercent, spercent;
		System.out.print("How many guests will be attending?: ");
		guests = sc.nextInt();
		System.out.print("How long will it last? (hours): ");
		time = sc.nextDouble();
		System.out.print("Do you know exactly what percent of wine/beer/spirits you want? (Yes/No): ");
		sc.nextLine();
		String response = sc.nextLine().trim().toLowerCase();
		String yes = "yes";
			if (response.equals(yes)) {
				double total = 100;
				System.out.print("As a percentage, how much of the alcohol present should be wine? (Percent left to allocate) %" + (int)total + ": ");
				wpercent = sc.nextDouble();
				total = total - wpercent;
				System.out.print("How much of it should be beer? (Percent left to allocate) %" + (int)total + ": ");
				bpercent = sc.nextDouble();
				total = total - bpercent;
				System.out.print("How much of it should be liquor? (Percent left to allocate) %" + (int)total + ": ");
				spercent = sc.nextDouble();
				System.out.println();
				System.out.println("Required amount of wine: " + wine(guests, time, wpercent) + " 750ml bottles");
				System.out.println("Required amount of beer: " + beer(guests, time, bpercent) + " 12oz bottles or cans");
				System.out.println("Required amount of spirits: " + spirits(guests, time, spercent) + " 750ml bottles of liquor");
				System.out.println();
				sc.close();
			} else {
				System.out.println();
				System.out.println("Required amount of wine: " + wine(guests, time, 50) + " 750ml bottles");
				System.out.println("Required amount of beer: " + beer(guests, time, 30) + " 12oz bottles or cans");
				System.out.printf("Required amount of spirits: %1.1f 750ml bottles of liquor", spirits(guests, time, 20));
				System.out.println();
				System.out.println();
			}
	}
	public static int wine(int guests, double time, double wpercent) {
		double percent = wpercent / 100;
		double bottles = (guests * (time + 1) * percent) / 5;
		return (int)Math.ceil(bottles);
	}
	public static int beer(int guests, double time, double bpercent) {
		double percent = bpercent / 100; 
		double bottles = (guests * (time + 1)) * percent;
		return (int)Math.ceil(bottles);
	}
	public static float spirits(int guests, double time, double spercent) {
		double percent = spercent / 100;
		double bottles = (guests * (time + 1) * percent) / 15;
		return (float)bottles;
	}
}
