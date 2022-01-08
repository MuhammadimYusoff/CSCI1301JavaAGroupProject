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

//	public static void main(String[] args){
//		owner owner1 = new owner(999);
//	}
}
