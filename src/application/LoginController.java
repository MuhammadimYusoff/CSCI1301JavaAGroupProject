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
	/***************** Scene Parent, Stage and Scene *******************/
	private Stage stage;
	private Scene scene;
	private Parent root;

	/***************** Scene Components *******************/
	@FXML
	private TextField id;
	@FXML
	private PasswordField password;
	@FXML
	private Label errorSignIn;
	@FXML
	private Button btnSignIn;

	/***************** Scene Objects & Variables *******************/
	Owner Own = new Owner("Omnicron", 8888, "0188888", 8888);

	/***************** Scene Methods *******************/
	public void signIn(ActionEvent event) throws IOException {
		System.out.println("Check User");
//		Initialise User Details
		int userID = Own.getId();
		int userPass = Own.getPin();
		System.out.println("User Data from Login Controller");
		System.out.println(Own.getId());
		System.out.println(Own.getPin());
		String userName = Integer.toString(userID);
		String userPin = Integer.toString(userPass);
		/* From Sign In Button */
//		System.out.println(userID);
//		System.out.println(userPass);

		/* Check User Credentials */
		System.out.println("Check Login");
		if (id.getText().toString().equals(userName) && password.getText().equals(userPin)) {
			System.out.println(userID);
			System.out.println(userPass);

//			Declare an FXMLLoader with "loader" as name and use it as root component
			FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentProfile.fxml"));
			root = loader.load();

//			Create Student Profile Instance Controller to load Student Profile, This allow to access the Methods in Student Profile
			StudentProfileController StudentProfileController = loader.getController();

//			Calling "passUserData" method from Student Profile to pass User Details
			StudentProfileController.passUserData(Own);

//			root = FXMLLoader.load(getClass().getResource("StudentProfile.fxml")); // Not needed
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}

		else if (id.getText().isEmpty() && password.getText().isEmpty()) {
			errorSignIn.setText("Please Enter Your Credential");
		}

		else {
			errorSignIn.setText("Wrong Username or Password");
		}
	}

}
