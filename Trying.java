import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class Trying extends Application {
	public static double value = 1.0, sum = 0.0;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		Alert intro = new Alert(Alert.AlertType.INFORMATION);
		intro.setContentText("Hello, I am going to sum whatever numbers you enter, let's see how good MY math skills are.");
		intro.showAndWait();
		TextInputDialog prompt = new TextInputDialog();
		prompt.setContentText("Enter a number");
		do {
			Optional<String> entry = prompt.showAndWait();
			value = Double.parseDouble(entry.get());
			sum += value;
		} while(value != 0);
		Alert result = new Alert(Alert.AlertType.INFORMATION);
		result.setContentText("The sum is " + sum);
		result.showAndWait();
	}
	
}
