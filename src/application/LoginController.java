package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
public LoginController() {
		
	}
	@FXML
	private Button loginButton; // connect to Sign In Button
	@FXML
	private Label errorSignIn; // connect to error Label
	@FXML
	private TextField UserId; // connect to UserId TextField
	@FXML
	private PasswordField PassId; // connect to PassId TextField
	final String username = "saddam";
	final String password = "saddam";
	
	public void userLogin(ActionEvent event) throws IOException {
		System.out.println("Check Login");
		checkLogin(); // call "checkLogin" Method 
	}
	
	private void checkLogin() throws IOException {
//		Set new Main for the Scene, which will load Cashier Calculator System.
		Main mainClass = new Main();
		
//		Check User Input
		if(UserId.getText().toString().equals(username) && PassId.getText().toString().equals(password)) {
			errorSignIn.setText("Success!");
			mainClass.changeScene("Login.fxml");
		}
		
		else if(UserId.getText().isEmpty() && PassId.getText().isEmpty()) {
			errorSignIn.setText("Please Enter Your Credential");
		}
		
		else {
			errorSignIn.setText("Wrong Username or Password");
		}
	}
}