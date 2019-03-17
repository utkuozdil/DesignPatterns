package statedesignpattern;

public class Order {
	
	public Order() {
		currentState = new New();
	}

	private OrderState currentState;

	public double cancel() {
		double charge = currentState.handleCancellation();
		currentState = new Cancelled();
		return charge;
	}

	public void paymentSuccessful() {
		currentState = new Paid();
	}

	public void dispatched() {
		currentState = new InTransit();
	}

	public void delivered() {
		currentState = new Delivered();
	}
}
