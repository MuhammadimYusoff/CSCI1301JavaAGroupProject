package references;

public class owner {
	private static int id;

	public owner(int id) {
		this.setId(id);
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		owner.id = id;
	}
}
