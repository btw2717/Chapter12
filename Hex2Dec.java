import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a hex number: ");
		String hex = keyboard.nextLine();
		System.out.println("The decimal value for the hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
	}
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for(int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			int test = Character.digit(hexChar, 16);
			if(test == -1) {
				throw new NumberFormatException("Not a hex input");
			}
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);	
		}
		return decimalValue;
	}
	public static int hexCharToDecimal(char ch) {
		if(ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else // ch is '0', '1'...or'9'
			return ch - '0';
	}
}
