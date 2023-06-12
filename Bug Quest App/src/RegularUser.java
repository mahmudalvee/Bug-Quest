import java.util.ArrayList;

public class RegularUser extends User{
	ArrayList<String> Posts = new ArrayList<String>();
	
	public RegularUser(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}
	
	void addPost(String post) {
		Posts.add(post);
	}

	@Override
	void displayProfile() {
		System.out.println("Username: "+username +", Password: " +password);
	}


}
