package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class StudentProfileController {
	/***************** Scene Parent, Stage and Scene *******************/
	private Stage stage;
	private Scene scene;
	private Parent root;

	/***************** Scene Components *******************/
	@FXML
	private Label lblUserId;
	@FXML
	private Button btnRent;

	/***************** Scene Methods *******************/
//	Create a Method to Change the Label Text
	public void displayName(String username) {
		lblUserId.setText(username + " to Locker Rental System!");
	}

	public void rent(ActionEvent event) throws IOException {

//		Declare an FXMLLoader with "loader" as name and use it as root component
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LockerMenu.fxml"));
		root = loader.load();

//		Declare the Parent, Stages and Scenes
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
