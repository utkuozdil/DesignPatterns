package factorydesignpattern;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());

	}

	public static void printMessage(MessageCreator creator) {
		System.out.println(creator.getMessage().getContent());
	}
}
