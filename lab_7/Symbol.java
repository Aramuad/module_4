package lab_7;
import java.util.Scanner;
public class Symbol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, k, shape;
		char symbols;
		System.out.println();
		System.out.print("Enter a number to define dimensions of a shape: ");
		shape = sc.nextInt();
		System.out.println();
		System.out.print("Enter a symbol: ");
		symbols = sc.next().charAt(0);
			for (i = 0; i < shape; i++) {
				System.out.println();
				for (k = 0; k < shape; k++) {
					System.out.print(symbols + " ");
				}
			}
		System.out.println();
		System.out.println();
	}

}
