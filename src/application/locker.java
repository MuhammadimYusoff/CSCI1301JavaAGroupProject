package application;

public class locker {
//	private int number = 0;
	private String color; // = "Red";
	private int door = 0;
//	private char status = 'x'; // Check availability on the 'availability' value, explanation on lockerInterface.java
//	private int availability = 1; // Availability will replace to user ID number if they rent, then will replace
	// back by 1 if not rent.

	locker() {

	}

	locker(int number, String color, int door, int availability) { // char status
//		this.number = number;
		this.color = color;
		this.door = door;
//		this.status = status;
//		this.availability = availability;
	}

//	public int getNumber() {
//		return number;
//	}
//
//	public void setNumber(int number) {
//		this.number = number;
//	}

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

//	public char getStatus() {
//		return status;
//	}
//
//	public void setStatus(char status) {
//		this.status = status;
//	}

//	public int getAvailability() {
//		return availability;
//	}
//
//	public void setAvailability(int availability) {
//		this.availability = availability;
//	}

//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	int a = 3;
//	
//	Locker[] smallLocker = new Locker[a];
//	Locker[] mediumLocker = new Locker[a];
//	Locker[] largeLocker = new Locker[a];
//
//	for(int i = 0; i < a; i++) {
//		smallLocker[i] = new Locker();
//		mediumLocker[i] = new Locker();
//		largeLocker[i] = new Locker();
//		
//	}
//	
//	System.out.println(smallLocker[0].getcolor());
//	System.out.println(mediumLocker[2].getcolor());
//
//	
//	smallLocker[0].setAvailability(0);
//	
//	largeLocker[1].setAvailability(0);
//	System.out.println(smallLocker[0].getAvailability());
//	System.out.println(smallLocker[1].getAvailability());
//	System.out.println(smallLocker[2].getAvailability());
//	
//	System.out.println(largeLocker[0].getAvailability());
//	System.out.println(largeLocker[1].getAvailability());
//	System.out.println(largeLocker[2].getAvailability());
//	
//	System.out.println(mediumLocker[0].getAvailability());
//	System.out.println(mediumLocker[1].getAvailability());
//	System.out.println(mediumLocker[2].getAvailability());
//	
//}
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