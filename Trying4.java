import java.util.Scanner;
import java.util.InputMismatchException;

public class Trying4 {
	private static double sum = 0.0;
	private static Scanner keyboard = new Scanner(System.in);
	private static double value = 1.0;
	public static double summy() {
		do {
			System.out.println("Enter a number: ");
			try {
			value = keyboard.nextDouble();
			sum += value;
			} catch(InputMismatchException e) {
				System.out.println("Invalid input, enter a number");
				keyboard.next();
			}
		} while(value != 0);
		return sum;
	}
	public static void main(String[] args) {
		summy();
		System.out.println("The sum is: " + sum);
	}
}
