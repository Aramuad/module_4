package lab_7;

public class Shape {

	public static void main(String[] args) {
		int rows = 8;
		int i, s;
		for (i = 0; i < rows; i++) {
			for (s = rows - i; s > 1; s--) {
				System.out.print(" "); 
			} 
			for (s = 0; s <= i; s++ ) {
				System.out.print("*"); 
			} 
			for(s = 0; s < i; s++) {
                System.out.print("*"); 
			}
			System.out.println(); 
		}
	}
		
}