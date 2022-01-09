package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	private static Stage test;

	@Override
	public void start(Stage primaryStage) {

		try {
			test = primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
			primaryStage.setTitle("StudentProfile Login");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void changeScene(String fxml) throws IOException {
		Parent pane = FXMLLoader.load(getClass().getResource(fxml)); // the resource will be pass from the class that
																		// have the fxml name
		test.getScene().setRoot(pane);
	}

	public static void main(String[] args) {
//		Initialise User Details
//		Owner Own = new Owner("Omnicron", 8888, "0188888", 8888);
//		Owner Own_ = new Owner("saddam", 1234, "0188888", 8888);
//		Vector ownerDetails = new Vector();

//		ownerDetails.addElement(Own);
//		System.out.println(ownerDetails);

		System.out.println("Get from Main Method");
//		System.out.println(Own_.getId());
//		System.out.println(Own_.getPin());

//		System.out.println("Vector from Main Method");
//		System.out.println(ownerDetails.toString());
//		Launch Application
		launch(args);
	}
}

////////////////////////////// Code Waste ////////////////////////////////////////
/*
 * This Main.java File will be divided into 4 Parts Handling: 1) Sign In 2) User
 * Dashboard 3) Locker Rent UI 4) Checkout UI
 */

// public class Main {
//
// 	public static void main(String[] args) {
// 		Owner own = new Owner();
// 		own.login();
//
////		Make 3 Owner Object, their own name, pin 
////		the owner will take their own locker hardcode
//
//		Owner owner0 = new Owner("Stringing", 123, 011101010, 123, "3", 0.0);
//		Owner owner1 = new Owner("testing", 123, 011100, 123, "testing", 45.0);
//
//		Declare the lockers in array
//		smallLocker[] smollLocker = { (new smallLocker(1, "Shiro", 2, false)), (new smallLocker(2, "Kuro", 2, true)),
//				(new smallLocker(3, "Gorudo", 2, true)) };
//		smallLocker.lockersAvailable(smollLocker);
//
//		System.out.println(smallLocker[0].door);
//
// mediumLocker[] medLocker = { (new mediumLocker(1, "Shiro", 2, false, 3)),
// 		(new mediumLocker(2, "Kuro", 2, true, 3)), (new mediumLocker(3, "Gorudo", 2, true, 3)) };
// mediumLocker.lockersAvailable(medLocker);
//
// System.out.println(medLocker.toString());
//		System.out.println(medLocker[1].deepToString());
//
//		System.out.println(Arrays.deepToString(obj)); // Output: true (available)
//		System.out.println("The Price: " + small.price);
//	System.out.println(!small.availability); // Output: false (not available)
//
//		System.out.print(Arrays.toString(small.availability)); // Check value of Availability
//		for (int i = 0; i > small.availability.length; i++) {
//		}
//		small.getColor();
//		System.out.println();
//		smallLocker[] small = new smallLocker[3];
//		System.out.println(Arrays.toString(small));
//
//		System.out.println(a);
// 	}
// }