import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter coordinates for first line: ");
		
		int x1 = 0, x2 = 0;
		
		try {
			x1 = keyboard.nextInt();
		    x2 = keyboard.nextInt();
		} catch(Exception e) {
			System.out.println("Invalid input. Input must be a number.");
			System.out.println("Program terminated.");
		}
		
		System.out.print("Enter coordinates for second line: ");
		
		int x3 = 0, x4 = 0;
		
		try {
			x3 = keyboard.nextInt();
		    x4 = keyboard.nextInt();
		} catch(Exception e) {
			System.out.println("Invalid input. Input must be a number.");
			System.out.println("Program terminated.");
		}
		
		if(x2 >= x4) {
			if(x4 > x1) {
				System.out.println("The two lines overlap");
			} else {
				System.out.println("The two lines don't overlap");
			}
		} else { // X4 > X2
			if(x2 > x3) {
				System.out.println("The two lines overlap");
			} else {
				System.out.println("The two lines don't overlap");
			}
		}
		
		
		
	}

}
