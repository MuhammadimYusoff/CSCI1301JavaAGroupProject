package application;

//public class lockers {
//	@FXML
//	private Label totalPrice;
//	@FXML
//	public double totalPayment;	
//	@FXML
//	TextField nameTextfield;
//	
//	public void smallLockerTotalRent(ActionEvent e) {
//		// idk y its wrong, NW will figure it out
//	}
//
//	public void midLockerTotalRent(ActionEvent e) {
//	}
//
//	public void largeLockerTotalRent(ActionEvent e) {
//	}
//	
//	public void pass(ActionEvent event) throws IOException{
//	}
//}

class smallLocker extends locker { // implements lockerInterface
	int id;
	final int door = 2;
	double price = 20.00;
	boolean availability; // this will be replaced by false if it's rented
//	availability.length() <-- this one for display how many

	smallLocker() {

	}

	smallLocker(int id, int door, boolean availability) { // , char status

	}

//	Check How Many Small Lockers Available for Rent
	public static void lockersAvailable(smallLocker[] arr) { // lockers.java dan locker.java
		int foundSmall = 0;
//		int foundMed = 0;
//		int foundLarge = 0;
		System.out.println("\nAvailable Lockers\n-----------------");
		for (smallLocker x : arr) {
			if (x.availability == true)
				foundSmall++;
		}
		System.out.println("Small Locker Available for rent: " + foundSmall); // use for lockers to display on
																				// "Available" label
	}

	public String toString() {
		return "lockerID: " + id + "\nDoor: " + door + "\nAvailable: " + availability;
	}
}

class mediumLocker extends locker {
	int id;
	final String color = "Brown";
	final int door = 3;
	double price = 40.00;
	boolean availability;
	// int[] availability = { 1, 1, 1 };
	int shelves = 2;

	mediumLocker() {

	}

	mediumLocker(int id, int door, boolean availability, int shelves) {
	}

//	Check How Many Small Lockers Available for Rent
	public static void lockersAvailable(mediumLocker[] arr) { // lockers.java dan locker.java
//		int foundSmall = 0;
		int foundMed = 0;
//		int foundLarge = 0;
		System.out.println("\nAvailable Lockers\n-----------------");
		for (mediumLocker x : arr) {
			if (x.availability == true)
				foundMed++;
		}
		System.out.println("Medium Locker Available for rent: " + foundMed); // use for lockers to display on
																				// "Available" label
	}

	public String toString() {
		return "lockerID: " + id + "\nColor: " + color + "\nDoor: " + door + "\nAvailable: " + availability;
	}
}

class largeLocker extends locker {
	int id;
	final String color = "Gold";
	final int door = 4;
	double price = 60.00;
	boolean availability;
	// int[] availability = { 1, 1, 1 };
	int shelves = 4;

	largeLocker() {

	}

	largeLocker(int id, int door, boolean availability, int shelves) {
	}

//	Check How Many Small Lockers Available for Rent
	public static void lockersAvailable(largeLocker[] arr) { // lockers.java dan locker.java
//		int foundSmall = 0;
//		int foundMed = 0;
		int foundLarge = 0;
		System.out.println("\nAvailable Lockers\n-----------------");
		for (largeLocker x : arr) {
			if (x.availability == true)
				foundLarge++;
		}
		System.out.println("Large Lockers Available for rent: " + foundLarge); // use for lockers to display on
																				// "Available" label
	}
}
