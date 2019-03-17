package statedesignpattern;

public class New implements OrderState {
	@Override
	public double handleCancellation() {
		System.out.println("It's a new order. No process");
		return 0;
	}
}
