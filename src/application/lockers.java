package application;

public class lockers {

}

class smallLocker extends locker {
	int number = (int) Math.round(Math.random() * 100);
	String color = "White";
	int door = 2;
	int availability = 1;

	smallLocker() {

	}

	smallLocker(int number, String color, int door, int availability) { // , char status

	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
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

	public void setColor(String color) {
		this.color = color;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

}

class mediumLocker extends locker {
	int door = 3;

	mediumLocker() {

	}

	mediumLocker(int number, String colour, int door, char status, int availability, int shelves) {
	}
}

class largeLocker extends locker {
	largeLocker() {

	}

	largeLocker(int number, String colour, int door, char status, int availability, int shelves) {
	}
}
