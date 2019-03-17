package simplefactorydesignpattern;

public class PostFactory {

	public static Post createPost(String type) {
		if (type.equals("blog"))
			return new BlogPost();
		else if (type.equals("news"))
			return new NewsPost();
		else if (type.equals("product"))
			return new ProductPost();
		else
			throw new IllegalArgumentException("post type is unknown");
	}
}
