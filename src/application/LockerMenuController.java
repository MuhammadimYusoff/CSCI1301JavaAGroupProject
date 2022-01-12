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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LockerMenuController {
	/***************** Scene Parent, Stage and Scene *******************/
	private Stage stage;
	private Scene scene;
	private Parent root;

	/***************** Scene Components *******************/
	@FXML
	private TextField smallRentDay;
	@FXML
	private TextField midRentDay;
	@FXML
	private TextField largeRentDay;
	@FXML
	private Label smallDurationError;
	@FXML
	private Label midDurationError;
	@FXML
	private Label largeDurationError;
	@FXML
	private Label availabilitySmall;
	@FXML
	private Label availabilityMid;
	@FXML
	private Label availabilityLarge;
	@FXML
	private Button btnChooseSmall;
	@FXML
	private Button btnChooseMid;
	@FXML
	private Button btnChooseLarge;

	/***************** Scene Objects & Variables *******************/
	Double totalPrice = 0.0, totalPayment = 0.0;
	private Owner Own;
	private smallLocker[] small;
	private mediumLocker[] med;
	private largeLocker[] large;

	/*****************
	 * Scene Methods Display Available Lockers for Rent
	 *******************/
	public void displaysmallAvailability(int smallLockerAvailable) {
		availabilitySmall.setText("LOCKERS " + smallLockerAvailable);
	}

	public void displaymidAvailability(int midLockerAvailable) {
		availabilityMid.setText("LOCKERS " + midLockerAvailable);
	}

	public void displaylargeAvailability(int largeLockerAvailable) {
		availabilityLarge.setText("LOCKERS " + largeLockerAvailable);
	}

	/***** Passing User Data Method ***********/
	public void passUserData(Owner Own) {
		this.Own = Own;
		System.out.println("User Data from Locker Menu Controller");
		System.out.println(Own.getId());
		System.out.println(Own.getPin());
	}

	/***************** Scene Methods smallLockerTotalRent *******************/
	public void smallLockerTotalRent(ActionEvent event) throws IOException {
		if (smallRentDay.getText() == null || smallRentDay.getText().trim().isEmpty()
				|| smallRentDay.getText().equals("")) {
			smallDurationError.setText("Enter your Day");
		} else {
			double sizePrice = 20.00;
			double doorNoPrice = 20.00;
			int duration = Integer.parseInt(smallRentDay.getText());
			double RentTotal = duration + sizePrice + doorNoPrice;
			totalPayment = RentTotal;

			/***************** Scene Change *******************/
//				Declare an FXMLLoader with "loader" as name and use it as root component
			FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckoutCart.fxml"));
			root = loader.load();
			/*** Passing the data to other Page ****/
			CheckoutCartController CheckoutCartController = loader.getController();
			CheckoutCartController.displayRent(totalPayment);

			/*** Instantiate lockers ****/
			smallLocker[] small = { (new smallLocker(1, 2, false)), (new smallLocker(1, 2, true)),
					(new smallLocker(1, 2, true)) };
			mediumLocker[] med = { (new mediumLocker(1, 2, true, 2)), (new mediumLocker(1, 2, true, 2)),
					(new mediumLocker(1, 2, true, 2)) };
			largeLocker[] large = { (new largeLocker(1, 2, true, 4)), (new largeLocker(1, 2, true, 4)),
					(new largeLocker(1, 2, true, 4)) };

			/*** Let owner take 1 small locker ****/
			CheckoutCartController.takeSmallLocker(small, med, large, Own);

//			Declare the Parent, Stages and Scenes
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			stage.setTitle("Checkout Cart");
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}

	/***** Check Locker Available to be Rent Method ***********/
	public void midLockerTotalRent(ActionEvent event) throws IOException {
		if (midRentDay.getText() == null || midRentDay.getText().trim().isEmpty() || midRentDay.getText().equals("")) {
			midDurationError.setText("Enter your Day");
		} else {
			double sizePrice = 40.00;
			double doorNoPrice = 30.00;
			int duration = Integer.parseInt(midRentDay.getText());
			double RentTotal = duration + sizePrice + doorNoPrice;
			totalPayment = RentTotal;

			/***************** Scene Change midLockerTotalRent *******************/
//			Declare an FXMLLoader with "loader" as name and use it as root component
			FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckoutCart.fxml"));
			root = loader.load();
			/**** Passing the data to other Page ****/
			CheckoutCartController CheckoutCartController = loader.getController();
			CheckoutCartController.displayRent(totalPayment);

			/*** Instantiate lockers ****/
			smallLocker[] small = { (new smallLocker(1, 2, false)), (new smallLocker(1, 2, true)),
					(new smallLocker(1, 2, true)) };
			mediumLocker[] med = { (new mediumLocker(1, 2, true, 2)), (new mediumLocker(1, 2, true, 2)),
					(new mediumLocker(1, 2, true, 2)) };
			largeLocker[] large = { (new largeLocker(1, 2, true, 4)), (new largeLocker(1, 2, true, 4)),
					(new largeLocker(1, 2, true, 4)) };

			/*** Let owner take 1 medium locker ****/
			CheckoutCartController.takeMediumLocker(small, med, large, Own);

//			Declare the Parent, Stages and Scenes
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}

	public void largeLockerTotalRent(ActionEvent event) throws IOException {
		if (largeRentDay.getText() == null || largeRentDay.getText().trim().isEmpty()
				|| largeRentDay.getText().equals("")) {
			largeDurationError.setText("Enter your Day");
		} else {
			int duration = Integer.parseInt(largeRentDay.getText());
			double sizePrice = 60.00;
			double doorNoPrice = 40.00;
			double RentTotal = duration + sizePrice + doorNoPrice;
			totalPayment = RentTotal;

			/***************** Scene Change largeLockerTotalRent *******************/
//			Declare an FXMLLoader with "loader" as name and use it as root component
			FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckoutCart.fxml"));
			root = loader.load();
			/*** Passing the data to other Page ****/
			CheckoutCartController CheckoutCartController = loader.getController();
			CheckoutCartController.displayRent(totalPayment);

			/*** Instantiate lockers ****/
			smallLocker[] small = { (new smallLocker(1, 2, false)), (new smallLocker(1, 2, true)),
					(new smallLocker(1, 2, true)) };
			mediumLocker[] med = { (new mediumLocker(1, 2, true, 2)), (new mediumLocker(1, 2, true, 2)),
					(new mediumLocker(1, 2, true, 2)) };
			largeLocker[] large = { (new largeLocker(1, 2, true, 4)), (new largeLocker(1, 2, true, 4)),
					(new largeLocker(1, 2, true, 4)) };

			/*** Let owner take 1 large locker ****/
			CheckoutCartController.takeLargeLocker(small, med, large, Own);

//			Declare the Parent, Stages and Scenes
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}
}
