package sceneCommunicatation;

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

public class Scene2Controller {
//	Declare Components
	@FXML
	private Label lblName;
	@FXML
	private Button btnBack;

//	Declare the Parent, Stage and Scenes
	private Stage stage;
	private Scene scene;
	private Parent root;

//	Create a Method to Change the Label Text
	public void displayName(String username) {
		lblName.setText(username + "\nto Locker Rental System!");
	}

//	Method for the Button
	public void back(ActionEvent event) throws IOException {

//		Declare an FXMLLoader with "loader" as name and use it as root component
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
		root = loader.load();

//		Declare the Parent, Stages and Scenes
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
