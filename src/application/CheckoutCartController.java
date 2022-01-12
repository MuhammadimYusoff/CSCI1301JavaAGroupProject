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
	@FXML
	private Label displayDetails;

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

//		Pass User Details and display their name
		StudentProfileController.displayName(Own);
//		StudentProfileController.LockerRented(small, med, large, Own);

//		Declare the Parent, Stages and Scenes
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.setTitle("User Profile");
	}

	public void displayRent(double totalPayment) {
		totalPrice.setText("Total Payment is: \nRM" + totalPayment);
	}

	/******
	 * Methods to insert ownerID to lockerID and change its availability
	 ***********/
	public void takeSmallLocker(smallLocker[] small, mediumLocker[] med, largeLocker[] large, Owner Own) {
		this.Own = Own;
		int OwnerID = Own.getId();
		for (smallLocker x : small) {
			if (x.availability) {
				x.id = OwnerID;
				x.availability = false;
				System.out.println("Small: " + x.getAvailability());
				displayDetails.setText("Rent Details:\n" + "\nSize: Small" + x.toString());
//				Assign Locker to Array to pass to Student Profile
				this.small = small;
				this.med = med;
				this.large = large;
				System.out.println("From takeSmallLockerMethod");
				break;
			}
		}
	}

	public void takeMediumLocker(smallLocker[] small, mediumLocker[] med, largeLocker[] large, Owner Own) {
		this.Own = Own;
		int OwnerID = Own.getId();
		for (mediumLocker x : med) {
			if (x.availability) {
				x.id = OwnerID;
				x.availability = false;
				System.out.println("Medium: " + x.getAvailability());
				displayDetails.setText("Rent Details:\n" + "\nSize: Medium" + x.toString());
//				Assign Locker to Array to pass to Student Profile
				this.small = small;
				this.med = med;
				this.large = large;
				System.out.println("From takeMediumLockerMethod");
				System.out.println(small.toString());
				System.out.println(large.toString());
				break;
			}
		}
	}

	public void takeLargeLocker(smallLocker[] small, mediumLocker[] med, largeLocker[] large, Owner Own) {
		this.Own = Own;
		int OwnerID = Own.getId();
		for (largeLocker x : large) {
			if (x.availability) {
				x.id = OwnerID;
				x.availability = false;
				System.out.println("Large: " + x.getAvailability());
				displayDetails.setText("Rent Details:\n" + "\nSize: Large" + x.toString());
//				Assign Locker to Array to pass to Student Profile
				this.small = small;
				this.med = med;
				this.large = large;
				break;
			}
		}
	}
}
