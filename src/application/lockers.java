package application;

class smallLocker extends locker { // implements lockerInterface
	int id;
	int door = 2;
	double price = 20.00;
	boolean availability; // this will be replaced by false if it's rented

	smallLocker() {
	}

	smallLocker(int id, int door, boolean availability) {
		this.id = id;
		this.door = door;
		this.availability = availability;
	}

	public String toString() {
		return "\nDoor: " + door + "\nBase Price: " + price;
	}
}

class mediumLocker extends locker {
	int id;
	int door = 3;
	double price = 40.00;
	boolean availability;
	int shelves = 2;

	mediumLocker() {
	}

	mediumLocker(int id, int door, boolean availability, int shelves) {
		this.id = id;
		this.door = door;
		this.availability = availability;
		this.shelves = shelves;
	}

	public String toString() {
		return "\nDoor: " + door + "\nBase Price: " + price + "\nShelves: " + shelves;
	}
}

class largeLocker extends locker {
	int id;
	int door = 4;
	double price = 60.00;
	boolean availability;
	int shelves = 4;

	largeLocker() {
	}

	largeLocker(int id, int door, boolean availability, int shelves) {
		this.id = id;
		this.door = door;
		this.availability = availability;
		this.shelves = shelves;
	}

	public String toString() {
		return "\nDoor: " + door + "\nBase Price: " + price + "\nShelves: " + shelves;
	}
}
