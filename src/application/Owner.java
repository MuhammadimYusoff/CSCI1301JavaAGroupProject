package application;

import java.util.Scanner;

public class Owner {

	private String name; // Owner name
	private int id; // Owner ID, this will be use to check for rented locker
	private int phoneNo; // Owner phone number
	private int pin; // Owner password
	private byte day;
	private double totalRent;

	public Owner() {
	}

	// Testing Owner class
	public Owner(int id, int pin) {
		this.id = id;
		this.pin = pin;
	}

	public Owner(String name, int id, int phoneNo, int pin, byte day, double totalRent) {
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

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public byte getDay() {
		return day;
	}

	public void setDay(byte day) {
		this.day = day;
	}

	public double getTotalRent() {
		return totalRent;
	}

	public void setTotalRent(double totalRent) {
		this.totalRent = totalRent;
	}

	public void login() {

		Scanner input = new Scanner(System.in);

		this.id = 8888;
		this.pin = 8888;

		System.out.println("enter id and pin: ");
		int inputId = input.nextInt();
		int inputPin = input.nextInt();

//		Checking User Credential
		String userCredential = (inputId == this.id && inputPin == this.pin) ? "Logged In" : "Wrong ID or PIN";
			System.out.println(userCredential);
		input.close();
		/// this just a trial i'll edit on that later
	}
}
