package application;

public class Owner {

//	Initialise Owner Details
	Owner Own = new Owner("Omnicron", 8888, "0188888", 8888, 0, 0.0);

	private String name; // Owner name
	private int id; // Owner ID, this will be use to check for rented locker
	private String phoneNo; // Owner phone number
	private int pin; // Owner password
	private int day;
	private double totalRent;

	public Owner() {
	}

	// Testing Owner class
	public Owner(int id, int pin) {
		this.id = id;
		this.pin = pin;
	}

	public Owner(String name, int id, String phoneNo, int pin, int day, double totalRent) {
		this.name = name;
		this.id = id;
		this.phoneNo = phoneNo;
		this.pin = pin;
		this.day = day;
		this.totalRent = totalRent;
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

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public double getTotalRent() {
		return totalRent;
	}

	public void setTotalRent(double totalRent) {
		this.totalRent = totalRent;
	}

//	public void login() {
//
//		Scanner input = new Scanner(System.in);
//
//		this.id = 8888;
//		this.pin = 8888;
//
//		System.out.println("enter id and pin: ");
//		int inputId = input.nextInt();
//		int inputPin = input.nextInt();
//
////		Checking User Credential
//		String userCredential = (inputId == this.id && inputPin == this.pin) ? "Logged In" : "Wrong ID or PIN";
//			System.out.println(userCredential);
//		input.close();
//		/// this just a trial i'll edit on that later
//	}
}
