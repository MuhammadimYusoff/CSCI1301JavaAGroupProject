package application;

public class lockers {

}

class smallLocker extends locker { // implements lockerInterface
	int number = (int) Math.round(Math.random() * 100);
	final String color = "White";
	final int door = 2;
	int availability = 1;

	smallLocker() {

	}

	smallLocker(int number, String color, int door, int availability) { // , char status

	}

	public int getDoor() {
		return door;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

}

class mediumLocker extends locker {
	int number = (int) Math.round(Math.random() * 100);
	final String color = "Brown";
	final int door = 3;
	int availability = 1;

	mediumLocker() {

	}

	mediumLocker(int number, String colour, int door, char status, int availability, int shelves) {
	}
}

class largeLocker extends locker {
	int number = (int) Math.round(Math.random() * 100);
	final String color = "Gold";
	final int door = 4;
	int availability = 1;

	largeLocker() {

	}

	largeLocker(int number, String colour, int door, char status, int availability, int shelves) {
	}
}
