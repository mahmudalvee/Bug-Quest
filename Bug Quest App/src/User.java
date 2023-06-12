
public abstract class User {
	protected String username;
	protected String password;
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	abstract void displayProfile();
	
}
