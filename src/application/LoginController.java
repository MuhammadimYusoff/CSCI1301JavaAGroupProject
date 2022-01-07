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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
//	Declare the Parent, Stage and Scenes
	private Stage stage;
	private Scene scene;
	private Parent root;

//	Scene Components
	@FXML
	private TextField id;
	@FXML
	private PasswordField password;
	@FXML
	private Label errorSignIn;
	@FXML
	private Button btnSignIn;

	/***************** Scene Methods *******************/
	public void signIn(ActionEvent event) throws IOException {

		System.out.println("Check Login");
		String username = id.getText();

//		Declare an FXMLLoader with "loader" as name and use it as root component
		FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentProfile.fxml"));
		root = loader.load();

//		Create Scene2 Instance Controller to load Scene 2, This allow to access the Methods in Scene 2
		StudentProfileController StudentProfileController = loader.getController();

//		Calling "displayName" method from Scene2 to pass the username
		StudentProfileController.displayName(username);

//		root = FXMLLoader.load(getClass().getResource("Scene2.fxml")); // Not needed
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
