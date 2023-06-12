
public class Admin extends User{
	
	public String role;
	public Admin(String username, String password, String role) {
		super(username, password);
		this.role = role;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void displayProfile() {
		System.out.println("Username: "+username +", Password: " +password +", Role: "+role);
	}

}
