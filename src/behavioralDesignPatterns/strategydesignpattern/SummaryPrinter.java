package strategydesignpattern;

import java.util.Collection;
import java.util.Iterator;

public class SummaryPrinter implements OrderPrinter {
	@Override
	public void print(Collection<Order> orders) {
		System.out.println("*********summary report************");
		Iterator<Order> iterator = orders.iterator();
		double total = 0;
		while (iterator.hasNext()) {
			Order order = iterator.next();
			total += order.getTotal();
			System.out.println(
					order.getId() + " " + order.getDate() + " " + order.getItems().size() + " " + order.getTotal());
		}
		System.out.println("**********************************");
		System.out.println("Total: " + total);
	}
}
