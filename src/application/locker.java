package application;

public class locker {
	private int id = 0; // locker id will be replaced with owner id if they rent it
	private String color; // = "Red";
	private int door = 0;
	private boolean availability = true; // Availability will replace to user ID number if they rent, then will replace
	// back by 1 if not rent.

	locker() {

	}

	locker(int id, String color, int door, boolean availability) {
		this.id = id; // this locker id will be replaced with user rent it.
		this.color = color; // only show the color
		this.door = door; // only show the door
		this.availability = availability; // check the locker availability
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean getAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public static void lockerRented(locker[] arr, int ownerID) {
		int found = 0;
		System.out.println("\nRented Lockers\n-----------------");
		for (locker x : arr) {
			// x.getId(): get the locker id and compare it to ownerID, if it's the same that
			// means the user rented it.
			if (x.getId() == ownerID)
				found++;
		}
		System.out.println("Rented Locker: " + found); // use for lockers to display on "Available" label
	}
}

//BELOW IS MAIN METHOD TO CREATE INSTANCES OF SMALL,MEDIUM,LARGE LOCKERS BUT I COMMENTED IT OUT BCS IT SHOULD BE IN ANOTHER FILE
/*
 * CODE GRAVEYARD
 * 
 * class smallLocker extends locker { smallLocker(int number, String color, int
 * door, char status, int availability) { } }
 * 
 * class mediumLocker extends locker { mediumLocker(int number, String color,
 * int door, char status, int availability, int shelves) { } }
 * 
 * class largeLocker extends locker { largeLocker(int number, String color, int
 * door, char status, int availability, int shelves) { } }
 */