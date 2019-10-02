package assignment_4;
import java.util.Scanner;
import java.lang.Math;
public class bruhRingIt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c ,d;
		System.out.print("Enter the hero's starting hp: ");
		a = sc.nextDouble();
		System.out.print("Enter the monster's starting hp: ");
		b = sc.nextDouble();
		System.out.print("Enter the hero's damage per strike: ");
		c = sc.nextDouble();
		System.out.print("Enter the monster's damage per strike: ");
		d = sc.nextDouble();
		game(a, b, c, d);
		sc.close();
	}
	private static void game(double herohp,
							 double monsterhp,
							 double herodmg,
							 double monsterdmg) {
		int counter = 0;
		double hero = herodmg;
		double monster = monsterdmg;
		while(herohp - monsterdmg >= 0 || monsterhp - herodmg >= 0) {
			herodmg = Math.floor(hero * Math.random()) + 1;
			monsterdmg = Math.floor(monster * Math.random()) + 1;
			herohp = herohp - monsterdmg;
			monsterhp = monsterhp - herodmg;
			System.out.println();
			System.out.println("====== ROUND " + counter + " ======");
			System.out.println("Hero attacks for: " + (int)herodmg);
			System.out.println("Monster has " + (int)monsterhp + " HP left");
			System.out.println("Monster attacks you for: " + (int)monsterdmg);
			System.out.println("You have " + (int)herohp + " HP left");
			if(monsterhp - herodmg <= 0) {
				counter ++;
				System.out.println();
				System.out.println("====== ROUND " + counter + " ======");
				System.out.println("Hero attacks for: " + (int)herodmg);
				System.out.println("Monster has " + (int)monsterhp + " HP left");
				System.out.println("The monster dies and you earn 5 xp");
				System.out.println("Battle ends...");
				System.out.println();
				break;
			} else if(herohp - monsterdmg <= 0) {
				counter++;
				System.out.println();
				System.out.println("====== ROUND " + counter + " ======");
				System.out.println("Hero attacks for: " + (int)herodmg);
				System.out.println("Monster has " + (int)monsterhp + " HP left");
				System.out.println("Monster attacks you for: " + (int)monsterdmg);
				System.out.println("You were killed by the monster and lose 10 gold");
				System.out.println("Battle ends...");
				System.out.println();
				break;
			}
			counter++;
		}
	}
}