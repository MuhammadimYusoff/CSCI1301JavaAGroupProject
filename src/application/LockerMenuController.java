package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LockerMenuController implements Initializable {
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

	/***************** Scene Methods smallLockerTotalRent *******************/
	public void smallLockerTotalRent(ActionEvent event) throws IOException {
		double sizePrice = 20.00;
		double doorNoPrice = 20.00;
		int duration = Integer.parseInt(smallRentDay.getText());
		double RentTotal = duration + sizePrice + doorNoPrice;
		totalPayment = RentTotal;
//		totalPrice.setText("Total Rent: " + RentTotal);

		/***************** Scene Change *******************/
//		Declare an FXMLLoader with "loader" as name and use it as root component
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckoutCart.fxml"));
		root = loader.load();
		/*** Passing the data to other Page ****/
		CheckoutCartController CheckoutCartController = loader.getController();
		CheckoutCartController.displayRent(totalPayment);

//		Declare the Parent, Stages and Scenes
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void midLockerTotalRent(ActionEvent event) throws IOException {
		double sizePrice = 40.00;
		double doorNoPrice = 30.00;
		int duration = Integer.parseInt(midRentDay.getText());
		double RentTotal = duration + sizePrice + doorNoPrice;
		totalPayment = RentTotal;
//		totalPrice.setText("Total Rent: " + RentTotal);

		/***************** Scene Change midLockerTotalRent *******************/
//		Declare an FXMLLoader with "loader" as name and use it as root component
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckoutCart.fxml"));
		root = loader.load();
		/**** Passing the data to other Page ****/
		CheckoutCartController CheckoutCartController = loader.getController();
		CheckoutCartController.displayRent(totalPayment);

//		Declare the Parent, Stages and Scenes
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void largeLockerTotalRent(ActionEvent event) throws IOException {
		double sizePrice = 60.00;
		double doorNoPrice = 40.00;
		int duration = Integer.parseInt(largeRentDay.getText());
		double RentTotal = duration + sizePrice + doorNoPrice;
		totalPayment = RentTotal;
//		totalPrice.setText("Total Rent: " + RentTotal);

		/***************** Scene Change largeLockerTotalRent *******************/
//		Declare an FXMLLoader with "loader" as name and use it as root component
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckoutCart.fxml"));
		root = loader.load();
		/*** s* Passing the data to other Page ****/
		CheckoutCartController CheckoutCartController = loader.getController();
		CheckoutCartController.displayRent(totalPayment);

//		Declare the Parent, Stages and Scenes
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void displaysmallAvailability(int smallLockerAvailable) {
		availabilitySmall.setText("Locker" + smallLockerAvailable);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}
