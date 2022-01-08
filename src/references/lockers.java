package references;

public class lockers {
	String name;
	boolean isAvailable;
	int pricePerHour; // price in $
	int id;

	public lockers(String name, boolean isAvailable, int pricePerHour, int id) {
		this.name = name;
		this.isAvailable = isAvailable;
		this.pricePerHour = pricePerHour;
		this.id = id;
	}

	public String toString() {
		return "Name: " + name + "\nAvailable: " + isAvailable + "\nPrice per hour: $" + pricePerHour + "\nID: " + id
				+ "\n+–----------------+";
	}

	public void checkOut() {
		this.isAvailable = false;
		this.id = owner.getId();
	}
}
