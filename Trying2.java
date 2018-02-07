import java.util.Scanner;
import java.util.InputMismatchException;
public class Trying2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double value = 1.0, sum = 0.0;
		do {
			System.out.println("Enter a number: ");
			try {
				value = keyboard.nextDouble();
				sum += value;
			} catch (InputMismatchException e){
				System.out.println("Invalid input! You must enter a decimal number.");
				keyboard.next();
			}
		} while(value != 0);
		System.out.println("The sum is: " + sum);
	}
}
