package application;

/*
 * This Main.java File will be divided into 4 Parts Handling:
 * 1) Sign In
 * 2) User Dashboard
 * 3) Locker Rent UI
 * 4) Checkout UI
 * */

public class Main {
	public static void main(String[] args) {

		smallLocker small = new smallLocker();

		System.out.println(small.getDoor());

	}
}
