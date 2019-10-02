package assignment_4;
import java.util.Scanner;
public class stayOnScreen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the X value: ");
		float x = sc.nextFloat();
		System.out.print("Enter the Y value: ");
		float y = sc.nextFloat();
		System.out.print("Enter the X velocity: ");
		float xv = sc.nextFloat();
		System.out.print("Enter the Y velocity: ");
		float yv = sc.nextFloat();
		frames(x, y, xv, yv);
		sc.close();
	}
	private static void frames(float x, float y, float xv, float yv) {
		do {
			System.out.printf("X: %1.1f	 Y: %1.1f", x, y);
			System.out.println();
			x += xv;
			y += yv;
		} while(x >= 0 && x <= 100 || y >= 0 && y <= 100); 
	}
}
