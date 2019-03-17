package factorydesignpattern;

public class TextMessageCreator extends MessageCreator {
	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
