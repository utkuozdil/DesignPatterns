package facadedesignpattern.email;

public class Email {
	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
