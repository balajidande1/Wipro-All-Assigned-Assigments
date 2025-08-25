package solid.priciples;

class User{
	private String name;
	
	public User(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
class Save{
	public Save(User u) {
		// TODO Auto-generated constructor stub
	}

	public void save(String message) {
		System.out.println("Single Responsibility " + message);
	}
}

public class SingleResponsibility {
	public static void main(String[] args) {
		User u = new User("RK");
		Save s = new Save(u);
		s.save("Save this");

	}

}
