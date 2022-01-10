package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
//		Initialise User Details
		Owner Own = new Owner("Omnicron", 8888, "0188888", 8888);
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			primaryStage.setScene(new Scene(root));
			primaryStage.setTitle("Login Screen");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

//		Launch Application
		launch(args);
	}
}
