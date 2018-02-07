import java.util.Scanner;
import java.util.Optional;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;

/**
 * The Hex2DecFX class extends the Application class as a javaFX Application and converts hexadecimal user entries to decimal.  If the entry is not hexadecimal, the program throws a NumberFormatException.
 * @author Sapper
 * @version 1.0
 * email: email
 * 6JAN2018
 */
public class Hex2DecFX extends Application {
	/**
	 * The main() method is written in as a fallback to launch but is not required.
	 * @param args arguments passed from the command line
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override //override the start method
	/**
	 * The start() method is the entry point of the application and initializes the dialogs.
	 * @param primaryStage the primary stage for the javafx dialogs
	 */
	public void start(Stage primaryStage) {
		TextInputDialog input = new TextInputDialog();
		input.setContentText("Enter a hex number");
		Optional<String> hexFrom = input.showAndWait();
		String hex = hexFrom.get();	
		Alert output = new Alert(Alert.AlertType.INFORMATION);
		output.setContentText("The decimal value for the hex number " + hex + " is " + hexToDecimal(hex));
		output.showAndWait();
	}
	/**
	 * the hexToDecimal method converts the character of each index of a hexadecimal string into decimal integer values or throws an exception if the entry is not a valid hexadecimal value.
	 * @param hex A hexadecimal String
	 * @return decimal values
	 */
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
	/**
	 * this method returns specific values for the upper case characters of the alphabet A through F.
	 * @param ch character input from a hex string
	 * @return hex values
	 */
	public static int hexCharToDecimal(char ch) {
		if(ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else // ch is '0', '1'...or'9'
			return ch - '0';
	}
}
