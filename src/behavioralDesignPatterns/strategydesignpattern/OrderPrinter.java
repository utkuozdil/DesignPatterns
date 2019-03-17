package strategydesignpattern;

import java.util.Collection;

public interface OrderPrinter {
	void print(Collection<Order> orders);
}
