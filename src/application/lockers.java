package application;

public class lockers {

}

class smallLocker extends locker { // implements lockerInterface
	int id;
	String color = "White";
	final byte door = 2;
	double price = 20.00;
	boolean availability = true; // this will be replaced by false if it's rented
//	availability.length() <-- this one for display how many

	smallLocker() {

	}

	smallLocker(int id, String color, byte door, boolean availability) { // , char status

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
}

class mediumLocker extends locker {
	int id;
	final String color = "Brown";
	final byte door = 3;
	double price = 40.00;
	boolean availability = true;
	// int[] availability = { 1, 1, 1 };
	byte shelves = 2;

	mediumLocker() {

	}

	mediumLocker(int id, String colour, byte door, boolean availability, byte shelves) {
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
}

class largeLocker extends locker {
	int id;
	final String color = "Gold";
	final byte door = 4;
	double price = 60.00;
	boolean availability = true;
	// int[] availability = { 1, 1, 1 };
	byte shelves = 4;

	largeLocker() {

	}

	largeLocker(int id, String colour, byte door, boolean availability, byte shelves) {
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
		System.out.println("Medium Locker Available for rent: " + foundLarge); // use for lockers to display on
																				// "Available" label
	}
}
