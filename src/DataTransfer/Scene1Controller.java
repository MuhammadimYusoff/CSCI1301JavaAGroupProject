package DataTransfer;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {
//	Declare Components
	@FXML
	private TextField txtUsername;
	@FXML
	private Button btnSignIn;

//	Declare the Parent (if needed) Stage and Scene
	private Stage stage;
	private Scene scene;
	private Parent root;

	public void SignIn(ActionEvent event) throws IOException {
		String username = txtUsername.getText(); // We will pass and reuse later for next scene

//		Declare an FXMLLoader with "loader" as name and use it as root component
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
		root = loader.load();

//		Create Scene2 Instance Controller to load Scene 2, This allow to access the Methods in Scene 2
		Scene2Controller Scene2Controller = loader.getController();

//		Calling "displayName" method from Scene2 to pass the username
		Scene2Controller.displayName(username);

//		root = FXMLLoader.load(getClass().getResource("Scene2.fxml")); // Not needed
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
