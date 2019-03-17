package statedesignpattern;

public class Cancelled implements OrderState{
	@Override
	public double handleCancellation() {
		throw new IllegalStateException("Already cancelled");
	}
}
