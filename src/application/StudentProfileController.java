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
import references.lockers;
import references.owner;

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
	private String id;
	private static int availsmall = 0;

	/***************** Scene Methods *******************/
//	Create a Method to Change the Label Text
	public void displayName(String username) {
		id = username;
		System.out.println("User Data from Student Profile Controller");
		lblUserId.setText("Welcome " + username + " to Locker Rental System!");
	}

	public void rent(ActionEvent event) throws IOException {
		smallLocker[] small = { (new smallLocker(1,2,true)), (new smallLocker(1,2,true)),
				(new smallLocker(1,2,true)) };
		
		mediumLocker[] med = { (new mediumLocker(1,2,true,2)), (new mediumLocker(1,2,true,2)),
				(new mediumLocker(1,2,true,2)) };

		largeLocker[] large = { (new largeLocker(1,2,true,4)), (new largeLocker(1,2,true,4)),
				(new largeLocker(1,2,true,4)) };
		
		// Declare the Owner for the lockers.
				owner Owner = new owner(2);
				System.out.println("OwnerID: " + Owner.getId());

				// Printout Available Lockers can be rented. // Use This
				smalllockersAvailable(small);

				// Printout Rented Lockers to Student Profile Screen. // Use This
				smalllockersRented(small, owner.getId()); // carSelection(obj, carName, rentHours);
				
				mediumlockersAvailable(med);
				
				mediumlockersRented(med,owner.getId());
				
				largelockersAvailable(large);
				
				largelockersRented(large,owner.getId());
				
				

				

		//		Declare an FXMLLoader with "loader" as name and use it as root component
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LockerMenu.fxml"));
		root = loader.load();
		
		//Create LockerMenu Instance Controller to load LockerMenu, This allow to access the Methods in LockerMenu 
		LockerMenuController smallLocMenuController = loader.getController();

		
		//Calling "displaysmallAvailability" method from  to pass.
		smallLocMenuController.displaysmallAvailability(availsmall);

//		Declare the Parent, Stages and Scenes
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	// Check How Many Lockers Available
	public static void smalllockersAvailable(smallLocker[] arr) { // lockers.java dan locker.java
		int foundSmall = 0;
		System.out.println("\nAvailable Lockers\n-----------------");
		for (smallLocker x : arr) {
			if (x.availability)
				foundSmall++;
		} 			availsmall=foundSmall;

		System.out.println(foundSmall); // use for lockers to display on "Available" label
	}
	
	public static void smalllockersRented(smallLocker[] arr, int id) {
		int ownerID = owner.getId();
		int foundIDsmall = 0;
		System.out.println("\nRented Lockers\n-----------------");
		for (smallLocker x : arr) {
			if (x.id == ownerID)
				foundIDsmall++;
		}
		System.out.println("Rented Small Locker: " + foundIDsmall); // use for lockers to display on "Available" label
	}
	
	public static void mediumlockersAvailable(mediumLocker[] arr) { // lockers.java dan locker.java
		int foundMedium= 0;
		System.out.println("\nAvailable Lockers\n-----------------");
		for (mediumLocker x : arr) {
			if (x.availability)
				foundMedium++;
		}
		System.out.println(foundMedium); // use for lockers to display on "Available" label
	}

	public static void mediumlockersRented(mediumLocker[] arr, int id) {
		int ownerID = owner.getId();
		int foundIDmedium = 0;
		System.out.println("\nRented Lockers\n-----------------");
		for (mediumLocker x : arr) {
			if (x.id == ownerID)
				foundIDmedium++;
		}
		System.out.println("Rented medium Locker: " + foundIDmedium); // use for lockers to display on "Available" label
	}
	
	public static void largelockersAvailable(largeLocker[] arr) { // lockers.java dan locker.java
		int foundLarge= 0;
		System.out.println("\nAvailable Lockers\n-----------------");
		for (largeLocker x : arr) {
			if (x.availability)
				foundLarge++;
		}
		System.out.println(foundLarge); // use for lockers to display on "Available" label
	}

	public static void largelockersRented(largeLocker[] arr, int id) {
		int ownerID = owner.getId();
		int foundlargeID = 0;
		System.out.println("\nRented Lockers\n-----------------");
		for (largeLocker x : arr) {
			if (x.id == ownerID)
				foundlargeID++;
		}
		System.out.println("Rented large Locker: " + foundlargeID); // use for lockers to display on "Available" label
	
		
	}

}
