
 public class Locker {
	private int number = 0;
	private String colour = "Red";
	private int door = 0;
	private char status = 'x';
	private int availability = 1;
	
	Locker(){
		
	}
	
	Locker( int number, String colour, int door, char status, int availability){
		this.number = number;
		this.colour = colour;
		this.door = door;
		this.status = status;
		this.availability = availability;

		
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

class smallLocker extends Locker{
	smallLocker(int number, String colour, int door, char status, int availability){
	}
}

class mediumLocker extends Locker{
	mediumLocker(int number, String colour, int door, char status, int availability,int shelves){
		}
}
	
class largeLocker extends Locker{
	largeLocker(int number, String colour, int door, char status, int availability,int shelves){
		}
}
	
// BELOW IS MAIN METHOD TO CREATE INSTANCES OF SMALL,MEDIUM,LARGE LOCKERS BUT I COMMENTED IT OUT BCS IT SHOULD BE IN ANOTHER FILE
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
//	System.out.println(smallLocker[0].getColour());
//	System.out.println(mediumLocker[2].getColour());
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
 
 



