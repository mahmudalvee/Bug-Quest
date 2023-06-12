
public class Post implements Likeable {

	public String Content;
	public int Likes;
	
	
	public Post(String content) {
		super();
		Content = content;
	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		Likes++;
	}

	@Override
	public void unlike() {
		// TODO Auto-generated method stub
		Likes--;
	}

}
