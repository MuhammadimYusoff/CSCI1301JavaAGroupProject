package application;

import java.util.Arrays;

public class lockers {

}

class smallLocker extends locker { // implements lockerInterface
//	int number = (int) Math.round(Math.random() * 100);
	String color = "White";
	final int door = 2;
	double price = 20.00;
	boolean availability = true; // {123, 1, 1} <-- for value check (this example 3 smallLockers, one rented by
	// userID 123)
//	availability.length() <-- this one for display how many

	smallLocker() {

	}

	smallLocker(int number, String color, int door, int availability) { // , char status

	}

	void check(int availability[]) {
		System.out.println(Arrays.toString(availability));
	}

}

class mediumLocker extends locker {
//	int number = (int) Math.round(Math.random() * 100);
	final String color = "Brown";
	final int door = 3;
	double price = 40.00;
	int[] availability = { 1, 1, 1 };

	mediumLocker() {

	}

	mediumLocker(int number, String colour, int door, char status, int availability, int shelves) {
	}
}

class largeLocker extends locker {
//	int number = (int) Math.round(Math.random() * 100);
	final String color = "Gold";
	final int door = 4;
	double price = 60.00;
	int[] availability = { 1, 1, 1 };

	largeLocker() {

	}

	largeLocker(int number, String colour, int door, char status, int availability, int shelves) {
	}
}
