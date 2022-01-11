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

	/***************** Scene Objects & Variables *******************/
	private int availsmall;
	private int availmid;
	private int availlarge;
	private Owner Own;

	/***************** Scene Methods *******************/

	public void rent(ActionEvent event) throws IOException {
		smallLocker[] small = { (new smallLocker(1, 2, true)), (new smallLocker(1, 2, true)),
				(new smallLocker(1, 2, true)) };

		mediumLocker[] med = { (new mediumLocker(1, 2, true, 2)), (new mediumLocker(1, 2, true, 2)),
				(new mediumLocker(1, 2, true, 2)) };

		largeLocker[] large = { (new largeLocker(1, 2, true, 4)), (new largeLocker(1, 2, true, 4)),
				(new largeLocker(1, 2, true, 4)) };

		// Declare the Owner for the lockers.
//				Owner Owner = new Owner(2);
		System.out.println("OwnerID: " + Own.getId());

		// Printout Available Lockers can be rented. // Use This
		smalllockersAvailable(small);

		// Printout Rented Lockers to Student Profile Screen. // Use This
		smalllockersRented(small, Own.getId());

		mediumlockersAvailable(med);

		mediumlockersRented(med, Own.getId());

		largelockersAvailable(large);

		largelockersRented(large, Own.getId());

		// Declare an FXMLLoader with "loader" as name and use it as root component
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LockerMenu.fxml"));
		root = loader.load();

		// Create LockerMenu Instance Controller to load LockerMenu, This allow to
		// access the Methods in LockerMenu
		LockerMenuController LockerMenuControl = loader.getController();

		// Calling all display available lockers method from to pass.
		LockerMenuControl.displaysmallAvailability(availsmall);
		LockerMenuControl.displaymidAvailability(availmid);
		LockerMenuControl.displaylargeAvailability(availlarge);

//		Calling "passUserData" method from Student Profile to pass User Details
		LockerMenuControl.passUserData(Own);
		

//		Declare the Parent, Stages and Scenes
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.setTitle("Locker Menu Screen");
	}

	/***** Passing User Data Method ***********/
	public void passUserData(Owner Own) {
		this.Own = Own;
		lblUserId.setText("Welcome " + Own.getName() + " to Locker Rental System!");
		System.out.println("User Data from Student Profile Controller");
		System.out.println(Own.getId());
		System.out.println(Own.getPin());
	}

	public void displayName(String Username) {
		lblUserId.setText("Welcome " + Username + " to Locker Rental System!");
	}

	// ************* Check How Many Lockers Available ************* //
	public void smalllockersAvailable(smallLocker[] arr) { // lockers.java dan locker.java
		int foundSmall = 0;
		System.out.println("\nAvailable small Lockers\n-----------------");
		for (smallLocker x : arr) {
			if (x.availability == true)
				foundSmall++;
		}
		availsmall = foundSmall;
		System.out.println("haha sus" + foundSmall); // use for lockers to display on "Available" label
	}

	public void smalllockersRented(smallLocker[] arr, int ownerID) {
		int foundIDsmall = 0;
		System.out.println("\nRented small Lockers\n-----------------");
		for (smallLocker x : arr) {
			if (x.id == ownerID)
				foundIDsmall++;
		}
		System.out.println("Rented Small Locker: " + foundIDsmall); // use for lockers to display on "Available" label
	}

	public void mediumlockersAvailable(mediumLocker[] arr) { // lockers.java dan locker.java
		int foundMedium = 0;
		System.out.println("\nAvailable medium Lockers\n-----------------");
		for (mediumLocker x : arr) {
			if (x.availability == true)
				foundMedium++;
		}
		availmid = foundMedium;
		System.out.println(foundMedium); // use for lockers to display on "Available" label
	}

	public void mediumlockersRented(mediumLocker[] arr, int ownerID) {
		int foundIDmedium = 0;
		System.out.println("\nRented medium Lockers\n-----------------");
		for (mediumLocker x : arr) {
			if (x.id == ownerID)
				foundIDmedium++;
		}
		System.out.println("Rented medium Locker: " + foundIDmedium); // use for lockers to display on "Available" label
	}

	public void largelockersAvailable(largeLocker[] arr) { // lockers.java dan locker.java
		int foundLarge = 0;
		System.out.println("\nAvailable large Lockers\n-----------------");
		for (largeLocker x : arr) {
			if (x.availability == true)
				foundLarge++;
		}
		availlarge = foundLarge;
		System.out.println(foundLarge); // use for lockers to display on "Available" label
	}

	public void largelockersRented(largeLocker[] arr, int ownerID) {
		int foundlargeID = 0;
		System.out.println("\nRented large Lockers\n-----------------");
		for (largeLocker x : arr) {
			if (x.id == ownerID)
				foundlargeID++;
		}
		System.out.println("Rented large Locker: " + foundlargeID); // use for lockers to display on "Available" label

	}

}
