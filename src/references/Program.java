package references;

public class Program {
	public static void main(String[] args) {
		// Declare the Lockers to be use
		lockers[] obj = { (new lockers("smallLocker 1", true, 20, 1)), (new lockers("smallLocker 2", false, 20, 2)),
				(new lockers("smallLocker 3", true, 20, 3)) };

		lockers[] obj1 = { (new lockers("mediumLocker 1", true, 20, 1)), (new lockers("mediumLocker 2", false, 20, 2)),
				(new lockers("mediumLocker 3", true, 20, 3)) };

		lockers[] obj2 = { (new lockers("largeLocker 1", true, 20, 1)), (new lockers("largeLocker 2", false, 20, 2)),
				(new lockers("largeLocker 3", true, 20, 3)) };

		// Declare the Owner for the lockers.
		owner Owner = new owner(2);
		System.out.println("OwnerID: " + Owner.getId());

		// Printout Available Lockers can be rented. // Use This
		smalllockersAvailable(obj);

		// Printout Rented Lockers to Student Profile Screen. // Use This
//		smalllockersRented(obj, owner.getId()); // carSelection(obj, carName, rentHours);

//		mediumlockersAvailable(obj1);
//
//		mediumlockersRented(obj1, owner.getId());
//
//		largelockersAvailable(obj2);

//		largelockersRented(obj2, owner.getId());

		// lockersRented(obj, owner.getId()); // carSelection(obj, carName, rentHours);

		// Print out all Lockers available (Debug usage)
		// System.out.println("All car details\n---------------");
		// for(Car x:obj){
		// System.out.println(x);
		// }
		// checkOut buttton testing
//		obj[]
//		owner owner1 = new owner(555);
//		owner owner2 = new owner(111);
//
//		System.out.println(owner.getId());
//

//		obj[0].display();
//		obj[0].checkOut();
//		obj[0].display();
//
//		obj[1].display();
//		obj[1].checkOut();
//		obj[1].display();

	}

	// Check How Many Lockers Available
	public static void smalllockersAvailable(lockers[] arr) { // lockers.java dan locker.java
		int found = 0;
		// int foundSmall = 0;
		// int foundMed = 0;
		// int foundLarge = 0;
		System.out.println("\nAvailable Lockers\n-----------------");
		for (lockers x : arr) {
			if (x.isAvailable == true)
				found++;
		}
		System.out.println("haha" + found); // use for lockers to display on "Available" label
	}

	public static void smalllockersRented(lockers[] arr, int id) {
		int ownerID = owner.getId();
		int found = 0;
		System.out.println("\nRented Lockers\n-----------------");
		for (lockers x : arr) {
			if (x.id == ownerID)
				found++;
		}
		System.out.println("Rented Small Locker: " + found); // use for lockers to display on "Available" label
	}

	public static void mediumlockersAvailable(lockers[] arr) { // lockers.java dan locker.java
		int found = 0;
		// int foundSmall = 0;
		// int foundMed = 0;
		// int foundLarge = 0;
		System.out.println("\nAvailable Lockers\n-----------------");
		for (lockers x : arr) {
			if (x.isAvailable)
				found++;
		}
		System.out.println(found); // use for lockers to display on "Available" label
	}

	public static void mediumlockersRented(lockers[] arr, int id) {
		int ownerID = owner.getId();
		int found = 0;
		System.out.println("\nRented Lockers\n-----------------");
		for (lockers x : arr) {
			if (x.id == ownerID)
				found++;
		}
		System.out.println("Rented medium Locker: " + found); // use for lockers to display on "Available" label
	}

	public static void largelockersAvailable(lockers[] arr) { // lockers.java dan locker.java
		int found = 0;
		// int foundSmall = 0;
		// int foundMed = 0;
		// int foundLarge = 0;
		System.out.println("\nAvailable Lockers\n-----------------");
		for (lockers x : arr) {
			if (x.isAvailable)
				found++;
		}
		System.out.println(found); // use for lockers to display on "Available" label
	}

	public static void largelockersRented(lockers[] arr, int id) {
		int ownerID = owner.getId();
		int found = 0;
		System.out.println("\nRented Lockers\n-----------------");
		for (lockers x : arr) {
			if (x.id == ownerID)
				found++;
		}
		System.out.println("Rented large Locker: " + found); // use for lockers to display on "Available" label

	}
}
//	public static void lockersSelection(lockers[] arr, int id) {
//		int ownerID = owner.getId();
//		int found = 0;
//
//		int count = 0;
//	 for (int x : small.availability) { 
//		 if (x == ownerID) { found = true; break; }
//	 }
//	 System.out.println(found); 
//	//for (lockers x : arr) {
//	//if (carName.equals(x.name) && x.isAvailable) {
//	// System.out.println("\nThe l you selected is: " + x.name);
//	 }		

/*
 * 
 * }
 * 
 * /* Change to loop to able have ownerID and locker.id to be compared in one
 * loop if possible.
 */
// Check How Many Lockers Rented by a user to be display on Student Profile.

// Checkout Price.
// public static void carSelection(Car[] arr, String carName, int hours) {
// int count = 0;
// for (Car x : arr) {
// if (carName.equals(x.name) && x.isAvailable) {
// System.out.println("\nThe car you selected is: " + x.name);
// System.out.println("Your charges would be approx: $" + (x.pricePerHour) *
// hours);
// System.out.println("Your car will be delivered to your location soon.\nWe
// wish you a happy journey!!");
// break;
// } else
// count++;
// }
// if (count == 5) {
// System.out.println("\nSorry, the car name you entered is not available at the
// moment.");
// }
// }

// Other Codes
/*
 * for (int x : small.availability) { if (x == userid) { found = true; break; }
 * System.out.println(found); }
 */