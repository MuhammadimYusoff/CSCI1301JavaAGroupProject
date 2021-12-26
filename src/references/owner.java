package references;

public class owner {
	private static int id;

	public owner(int id) {
		this.setId(id);
	}

	public static int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
