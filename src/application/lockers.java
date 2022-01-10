package application;

class smallLocker extends locker { // implements lockerInterface
	int id;
	final int door = 2;
	double price = 20.00;
	boolean availability; // this will be replaced by false if it's rented

	smallLocker() {
	}

	smallLocker(int id, int door, boolean availability) {

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
	int shelves = 2;

	mediumLocker() {
	}

	mediumLocker(int id, int door, boolean availability, int shelves) {
	}

	public String toString() {
		return "lockerID: " + id + "\nDoor: " + door + "\nAvailable: " + availability;
	}
}

class largeLocker extends locker {
	int id;
	final String color = "Gold";
	final int door = 4;
	double price = 60.00;
	boolean availability;
	int shelves = 4;

	largeLocker() {
	}

	largeLocker(int id, int door, boolean availability, int shelves) {
	}

	public String toString() {
		return "lockerID: " + id + "\nDoor: " + door + "\nAvailable: " + availability;
	}
}
