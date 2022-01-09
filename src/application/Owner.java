package application;

public class Owner {

	private String name; // Owner name
	private int id; // Owner ID, this will be use to check for rented locker
	private String phoneNo; // Owner phone number
	private int pin; // Owner password

	public Owner() {
	}

	// Testing Owner class
	public Owner(int id, int pin) {
		this.id = id;
		this.pin = pin;
	}

	public Owner(String name, int id, String phoneNo, int pin) {
		this.name = name;
		this.id = id;
		this.phoneNo = phoneNo;
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getPin() {
		return pin;
	}
}
