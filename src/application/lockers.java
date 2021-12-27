package application;

public class lockers {

}

class smallLocker extends locker { // implements lockerInterface
	int id;
	String color = "White";
	final int door = 2;
	double price = 20.00;
	boolean availability = true; // this will be replaced by false if it's rented
//	availability.length() <-- this one for display how many

	smallLocker() {

	}

	smallLocker(int id, String color, int door, boolean availability) { // , char status

	}

//	Check How Many Lockers Available
	public static void lockersAvailable(smallLocker[] arr) { // lockers.java dan locker.java
		int foundSmall = 0;
		// int foundMed = 0;
		// int foundLarge = 0;
		System.out.println("\nAvailable Lockers\n-----------------");
		for (smallLocker x : arr) {
			if (x.availability == true)
				foundSmall++;
		}
		System.out.println(foundSmall); // use for lockers to display on "Available" label
	}

	// void check(int availability[]) {
	// System.out.println(Arrays.toString(availability));
	// }

}

class mediumLocker extends locker {
	int id;
	final String color = "Brown";
	final int door = 3;
	double price = 40.00;
	boolean availability = true;
	// int[] availability = { 1, 1, 1 };
	int shelves = 2;

	mediumLocker() {

	}

	mediumLocker(int id, String colour, int door, boolean availability, int shelves) {
	}

	// void check(int availability[]) {
	// System.out.println(Arrays.toString(availability));
	// }
}

class largeLocker extends locker {
	int id;
	final String color = "Gold";
	final int door = 4;
	double price = 60.00;
	boolean availability = true;
	// int[] availability = { 1, 1, 1 };
	int shelves = 4;

	largeLocker() {

	}

	largeLocker(int id, String colour, int door, boolean availability, int shelves) {
	}

}
