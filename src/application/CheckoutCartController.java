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

public class CheckoutCartController {
	/***************** Scene Parent, Stage and Scene *******************/
	private Stage stage;
	private Scene scene;
	private Parent root;

	/***************** Scene Components *******************/
	@FXML
	private Label lblLockerRentDetails;
	@FXML
	private Button btnCheckout;
	@FXML
	private Label totalPrice;

	/***************** Scene Objects & Variables *******************/
	private Owner Own;
	private smallLocker[] small;
	private mediumLocker[] med;
	private largeLocker[] large;

	/***************** Scene Methods *******************/
	public void checkOut(ActionEvent event) throws IOException {

//		Declare an FXMLLoader with "loader" as name and use it as root component
		FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentProfile.fxml"));
		root = loader.load();

//		Create Scene2 Instance Controller to load Scene 2, This allow to access the Methods in Scene 2
		StudentProfileController StudentProfileController = loader.getController();

//		Calling "displayName" method from Scene2 to pass the username
		StudentProfileController.displayName(Own.getName());
		StudentProfileController.passUserData(Own);

//		Declare the Parent, Stages and Scenes
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.setTitle("User Profile");
	}

	/***** Passing User Data Method ***********/
	public void passUserData(Owner Own) {
		this.Own = Own;
		System.out.println("User Data from Locker Menu Controller");
		System.out.println(Own.getId());
		System.out.println(Own.getPin());
	}

	public void displayRent(double totalPayment) {
		totalPrice.setText("Total Payment is: \n" + totalPayment);
	}

	/***** Methods to insert ownerID to lockerID and change its availability ***********/
	public void takeSmallLocker(smallLocker[] arr, int OwnerID){
		for (smallLocker x : arr) {
			if (x.availability) {
				x.id = OwnerID;
				x.availability = false;
				System.out.println("Small" + x.getAvailability());
				break;
			}
		}
	}
	public void takeMediumLocker(mediumLocker[] arr, int OwnerID){
		for (mediumLocker x : arr) {
			if (x.availability) {
				x.id = OwnerID;
				x.availability = false;
				break;
			}
		}
	}
	public void takeLargeLocker(largeLocker[] arr, int OwnerID){
		for (largeLocker x : arr) {
			if (x.availability) {
				x.id = OwnerID;
				x.availability = false;
				break;
			}
		}
	}

	public void passLockerData(smallLocker[] small, mediumLocker[] med, largeLocker[] large) {
		// TODO Auto-generated method stub
		this.small = small;
		this.med = med;
		this.large = large;
		
	}

}
