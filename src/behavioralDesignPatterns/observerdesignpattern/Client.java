package observerdesignpattern;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("100");
		PriceObserver priceObserver = new PriceObserver();
		QuantityObserver quantityObserver = new QuantityObserver();
		order.attach(priceObserver);
		order.attach(quantityObserver);
		order.addItem(50);
		order.addItem(480);
		order.addItem(50);
		order.addItem(50);
		order.addItem(50);
		order.addItem(50);
		System.out.println(order);
	}
}
